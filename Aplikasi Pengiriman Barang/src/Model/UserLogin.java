package Model;

public abstract class UserLogin {
    protected String username;
    protected String password;

    public String getUsername() {
        return username;
    }//getter mengambil username

    public String getPassword() {
        return password;
    }//getter mengambil password
    
    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }//konstruktor
    
    public abstract boolean isLogin();
    //untuk melihat apa berhasil  login atau tidak
}
