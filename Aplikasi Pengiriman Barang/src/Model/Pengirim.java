package Model;

import java.util.ArrayList;

public class Pengirim extends UserLogin{
    private int id_pengirim;
    private String email;
    private String no_telepon;
    private ArrayList<Barang> listBarang;

    public Pengirim(String username, String password) {
        super(username, password);
        listBarang = new ArrayList<>();
    }
    
    public Pengirim(int id_pengirim, String email, String username, String password, String no_telepon) {
        super(username, password);
        this.id_pengirim = id_pengirim;
        listBarang = new ArrayList<>();
        this.email = email;
        this.no_telepon = no_telepon;
    }

    public void addListBarang(Barang barang) {
        this.listBarang.add(barang);
    }
    
    public void hapusListBarang(Barang barang) {
        this.listBarang.remove(barang);
    }

    @Override
    public boolean isLogin() {
        if (username!=null&&password!=null){
            return true;
        } else {
            return false;
        }}
    
        public void setEmail(String email) {
        this.email = email;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public int getId_pengirim() {
        return id_pengirim;
    }

    public String getEmail() {
        return email;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public ArrayList<Barang> getListBarang() {
        return listBarang;
    }

    public void setId_pengirim(int id_pengirim) {
        this.id_pengirim = id_pengirim;
    }
    
    
}
