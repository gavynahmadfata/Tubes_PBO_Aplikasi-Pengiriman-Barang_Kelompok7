package Model;

public class Kurir extends UserLogin{

    private int no_kurir;
    private String status_kurir;
    private String tipe_kendaraan;
    private Barang barang;

    public Kurir(String username, String password) {
        super(username, password);
    }
    
    public Kurir(int no_kurir, String username, String password, String tipe_kendaraan) {
        super(username, password);
        this.no_kurir = no_kurir;
        this.tipe_kendaraan = tipe_kendaraan;
    }

    public void setStatus_kurir(String status_kurir) {
        this.status_kurir = status_kurir;
    }
    
    public void setStatus_barang(String status_barang) {
        barang.setStatus(status_barang);
    }

    @Override
    public boolean isLogin() {
        if (username!=null&&password!=null){
            return true;
        } else {
            return false;
        }
    }

    public void setNo_kurir(int no_kurir) {
        this.no_kurir = no_kurir;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public void setTipe_kendaraan(String tipe_kendaraan) {
        this.tipe_kendaraan = tipe_kendaraan;
    }

    public int getNo_kurir() {
        return no_kurir;
    }

    public String getStatus_kurir() {
        return status_kurir;
    }

    public String getTipe_kendaraan() {
        return tipe_kendaraan;
    }

    public Barang getBarang() {
        return barang;
    }
}
