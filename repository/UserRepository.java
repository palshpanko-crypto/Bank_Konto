package repository;
import java.util.HashMap;
import java.util.Map;
import model.User;

public class UserRepository {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) { users.put(user.getId(), user); }    //getId=userId
    public User getUser(String id) { return users.get(id); }
    public boolean exists(String id) { return users.containsKey(id); }
}