package Model;

public class OngkirLuarKota implements Payable{
    public static double ongkir = 20000;
    public static double hargaBerat = 7500;

    @Override
    public double hitungOngkir(double berat) {
        double hargaOngkir = (hargaBerat*berat)+ongkir;
        return hargaOngkir;
    }
    
}
