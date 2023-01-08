package Model;

public class OngkirDalamKota implements Payable{
    public static double ongkir = 10000;
    public static double hargaBerat = 5000;

    @Override
    public double hitungOngkir(double berat) {
        double hargaOngkir = (hargaBerat*berat)+ongkir;
        return hargaOngkir;
    }
    
}
