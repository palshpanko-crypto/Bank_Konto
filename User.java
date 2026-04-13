
public class User {

    private final String username;
    private final String login;
    private final String password;
    private final String id;
    private double balance;

    public User(String username, String login, String password, String id, double balance) {
        this.username = username;
        this.login = login;
        this.password = password;
        this.id = id;
        this.balance = balance;
    }

    public String getUserName() {
        return username;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    }
