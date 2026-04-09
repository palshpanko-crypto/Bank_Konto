public class User{
    private String username;
    private String login;
    private String password;
    private String id;
    public User(String username, String login, String password, String id){
        this.username = username;
        this.login = login;
        this.password = password;
        this.id = id;
    }
    public String getUserName() {return username;}
    public String getLogin() {return login;}
    public String getPassword() {return password;}
    public String getId() {return id;}
}