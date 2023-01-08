package Database;

import Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Database {
    private static final String SERVER="jdbc:mysql://localhost/db_pengiriman";
    private static final String DBUSER ="root";
    private static final String DBPASSWD="";
    static Statement statement;
    static Connection connection;
    
    private static void connect(){
        try{
            connection = DriverManager.getConnection(SERVER, DBUSER, DBPASSWD);
            statement =  connection.createStatement();
        }catch(SQLException ex){
            System.out.println("Tidak konek");
        }
    }
    
    public static void register(UserLogin user) throws SQLException{
        connect();
        if (user instanceof Pengirim){
            statement.executeUpdate("INSERT INTO pengirim VALUES ("
                    + ((Pengirim) user).getId_pengirim() + ", '"
                    + ((Pengirim) user).getEmail() + "', '"
                    + ((Pengirim) user).getUsername() + "', '"
                    + ((Pengirim) user).getPassword() + "', '"
                    + ((Pengirim) user).getNo_telepon()+"')");
        } else if (user instanceof Kurir) {
            statement.executeUpdate("INSERT INTO kurir VALUES ("
                    + ((Kurir) user).getNo_kurir() +", '"
                    + ((Kurir) user).getUsername() + "', '"
                    + ((Kurir) user).getPassword() + "', '"
                    + ((Kurir) user).getTipe_kendaraan()+"')");
        }
    }
    
    public static ArrayList<Barang> getListBarang() throws SQLException {
        connect();
        ResultSet rs = statement.executeQuery("SELECT * FROM barang");
        ArrayList<Barang> listBarang = new ArrayList<>();
        Pengirim pengirim = new Pengirim("", "");
        Kurir kurir = new Kurir("", "");
        while (rs.next()) {
            Barang barang = new Barang(rs.getString("deskripsi"), rs.getDouble("berat"));
            barang.setId_barang(rs.getInt("id_barang"));
            barang.setStatus(               rs.getString("status"));
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String date = rs.getString("tgl_pemesanan");
            //convert String to LocalDate
            LocalDate localDate = LocalDate.parse(date, formatter);
            barang.setTgl_pemesanan(localDate);
            
            barang.setStatus_pembayaran(rs.getString("status_pembayaran"));
            kurir.setNo_kurir(rs.getInt("no_kurir"));
            pengirim.setId_pengirim(rs.getInt("id_pengirim"));
            barang.setPengirim(pengirim);
            barang.setKurir(kurir);
            
            listBarang.add(barang);
        }
        return listBarang;
    }
    
    public static ArrayList<Barang> getListBarang(int id) throws SQLException{
        ArrayList<Barang> listBarang = new ArrayList<>();
        for (Barang barang : getListBarang()) {
            if (barang.getPengirim().getId_pengirim()==id){
                listBarang.add(barang);
            }
        }
        return listBarang;
    }
    
    public static ArrayList<Pengirim> getListPengirim() throws SQLException{
        connect();
        ArrayList<Pengirim> listPengirim = new ArrayList<>();
        ResultSet rs = statement.executeQuery("SELECT * FROM pengirim");
        while (rs.next()) {
            listPengirim.add(new Pengirim(rs.getInt("id_pengirim"),
                    rs.getString("email"), 
                    rs.getString("username"), 
                    rs.getString("password"), 
                    rs.getString("no_telepon")));
        }
        for (Pengirim pengirim : listPengirim) {
            for (Barang barang : getListBarang()) {
                if (pengirim.getId_pengirim()==barang.getPengirim().getId_pengirim()){
                    pengirim.addListBarang(barang);
                }
            }
        }
        return listPengirim;
    }
    
    public static ArrayList<Kurir> getListKurir() throws SQLException{
        connect();
        ArrayList<Kurir> listKurir = new ArrayList<>();
        ResultSet rs = statement.executeQuery("SELECT * FROM kurir");
        while (rs.next()) {                    
            listKurir.add(new Kurir(rs.getInt("no_kurir"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("tipe_kendaraan")));
        }
        for (Kurir kurir : listKurir) {
            for (Barang barang : getListBarang()) {
                if (kurir.getNo_kurir()==barang.getKurir().getNo_kurir()){
                    kurir.setBarang(barang);
                }
            }
        }
        return listKurir;
    }
    
    public static Admin getAdmin() throws SQLException{
        connect();
        ResultSet rs = statement.executeQuery("SELECT * FROM admin");
        Admin admin = null;
        while(rs.next()){
            admin = new Admin(rs.getString("username"), rs.getString("password"));
            admin.setListKurir(getListKurir());
            admin.setListPengirim(getListPengirim());
        }
        return admin;
    }
    
    public static void updateOngkir() throws SQLException{
        connect();
        statement.executeUpdate("UPDATE ongkir SET ongkir = "+OngkirDalamKota.ongkir
                +", harga_berat = "+OngkirDalamKota.hargaBerat
                +" WHERE jenis = 'dalam'");
        statement.executeUpdate("UPDATE ongkir SET ongkir = "+OngkirLuarKota.ongkir
                +", harga_berat = "+OngkirLuarKota.hargaBerat
                +" WHERE jenis = 'luar'");
    }
    
    public static void getOngkir() throws SQLException{
        connect();
        ResultSet rs = statement.executeQuery("SELECT * FROM ongkir WHERE jenis = 'dalam'");
        while (rs.next()) {            
            OngkirDalamKota.ongkir = rs.getDouble("ongkir");
            OngkirDalamKota.hargaBerat = rs.getDouble("harga_berat");
        }
        rs = statement.executeQuery("SELECT * FROM ongkir WHERE jenis = 'luar'");
        while (rs.next()) {            
            OngkirLuarKota.ongkir = rs.getDouble("ongkir");
            OngkirLuarKota.hargaBerat = rs.getDouble("harga_berat");   
        }
    }
    
    public static void tambahBarang(Barang barang, Pengirim pengirim) throws SQLException{
        connect();
        statement.executeUpdate("INSERT INTO barang VALUES ("
                + barang.getId_barang() +", '"
                + barang.getDeskripsi() +"', "
                + barang.getBerat() +", '"
                + "Belum dikirim" +"', '"
                + "Belum dibayar" +"', '"
                + LocalDate.now().toString() +"', "
                + pengirim.getId_pengirim() +", "
                + 0 +")");
    }
    
    public static void deleteBarang(int id) throws SQLException{
        connect();
        statement.executeUpdate("DELETE FROM barang WHERE id_barang = "+id);
    }
    
    public static void editBarang(Barang barang) throws SQLException{
        connect();
        statement.executeUpdate("UPDATE barang SET "
                + "deskripsi = '"+barang.getDeskripsi()
                + "', berat = "+barang.getBerat()
                + ", status = '"+barang.getStatus()
                + "', status_pembayaran = '"+barang.getStatus_pembayaran()
                + "', tgl_pemesanan = '"+barang.getTgl_pemesanan().toString()
                + "', id_pengirim = "+barang.getPengirim().getId_pengirim()
                + ", no_kurir = "+barang.getKurir().getNo_kurir()
                + " WHERE id_barang = "+barang.getId_barang());
    }
    
    public static DefaultListModel showListBarang() throws SQLException{
        DefaultListModel<Object> model = new DefaultListModel<>();
        for (Barang barang : getListBarang()) {
            model.addElement("Barang "+barang.getId_barang());
        }
        return model;
    }
    
    public static DefaultListModel showListBarang(int id) throws SQLException{
        DefaultListModel<Object> model = new DefaultListModel<>();
        for (Barang barang : getListBarang()) {
            if (barang.getPengirim().getId_pengirim()==id){
                model.addElement("Barang "+barang.getId_barang());
            }
        }
        return model;
    }
    
    public static DefaultComboBoxModel showKurirBoxModel() throws SQLException{
        DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
        for (Kurir kurir : getListKurir()) {
            model.addElement(kurir.getUsername()+" - Kurir "+kurir.getNo_kurir());
        }
        return model;
    }
}
