package Model;

public class UserLogin {
    private String user;
    private String pass;
    private int pin;

    public UserLogin(){
    }

    public UserLogin(String user, String pass, int pin) {
        this.user = user;
        this.pass = pass;
        this.pin = pin;
    }
}
