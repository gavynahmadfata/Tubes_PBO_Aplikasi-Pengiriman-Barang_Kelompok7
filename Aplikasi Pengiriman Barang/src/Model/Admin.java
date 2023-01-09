package Model;

import java.util.ArrayList;

public class Admin extends UserLogin{
    private ArrayList<Pengirim> listPengirim;
    private ArrayList<Kurir> listKurir;

    public Admin(String username, String password) {
        super(username, password);
        listPengirim = new ArrayList<>();
        listKurir = new ArrayList<>();
    }//konstruktor mengambil 2 parameter username dan password, menginisialisasi listpengirim dan listkurir

    @Override
    public boolean isLogin() {
        if (username!=null&&password!=null){
            return true;
        } else {
            return false;
        }
    }//implementasi dari method abstrak isLogin di userlogin

    public void setListPengirim(ArrayList<Pengirim> listPengirim) {
        this.listPengirim = listPengirim;
    }

    public void setListKurir(ArrayList<Kurir> listKurir) {
        this.listKurir = listKurir;
    }

    public ArrayList<Pengirim> getListPengirim() {
        return listPengirim;
    }

    public ArrayList<Kurir> getListKurir() {
        return listKurir;
    }
}
