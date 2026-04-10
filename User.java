
public class User {

    private final String username;
    private final String login;
    private final String password;
    private final String id;
    private int amount;

    public User(String username, String login, String password, String id, int amount) {
        this.username = username;
        this.login = login;
        this.password = password;
        this.id = id;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }
}
