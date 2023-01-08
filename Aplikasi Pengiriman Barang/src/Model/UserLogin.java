package Model;

public abstract class UserLogin {
    protected String username;
    protected String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public abstract boolean isLogin();
}
