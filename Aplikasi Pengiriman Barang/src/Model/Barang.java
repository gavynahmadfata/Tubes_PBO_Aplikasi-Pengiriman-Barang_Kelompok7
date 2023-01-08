package Model;

import java.time.LocalDate;

public class Barang {
    private int id_barang;
    private String deskripsi;
    private double berat;
    private String status;
    private Pengirim pengirim ;
    private Kurir kurir ;
    private LocalDate tgl_pemesanan;
    private String status_pembayaran;

    public Barang(String deskripsi, double berat) {
        this.deskripsi = deskripsi;
        this.berat = berat;
        this.tgl_pemesanan = LocalDate.now();
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getId_barang() {
        return id_barang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getBerat() {
        return berat;
    }

    public String getStatus() {
        return status;
    }

    public Pengirim getPengirim() {
        return pengirim;
    }

    public Kurir getKurir() {
        return kurir;
    }

    public LocalDate getTgl_pemesanan() {
        return tgl_pemesanan;
    }
    
    public void setPengirim(Pengirim pengirim) {
        this.pengirim = pengirim;
    }

    public void setTgl_pemesanan(LocalDate tgl_pemesanan) {
        this.tgl_pemesanan = tgl_pemesanan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }

    public String getStatus_pembayaran() {
        return status_pembayaran;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }
    
}
