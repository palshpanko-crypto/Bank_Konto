
import java.util.HashMap;
import java.util.UUID;

public class UserRepository {

    private final HashMap<String, User> users = new HashMap<>();

    public UserRepository() {
        User Andrew = new User("Andrew", "andrew12", "andrew2003", UUID.randomUUID().toString(), 4435.34);
        User Mike = new User("Mike", "mikhael", "123mike123", UUID.randomUUID().toString(), 2342.56);

        users.put("andrew12", Andrew);
        users.put("mikhael", Mike);
    }

    public User getByLogin(String login) {
        return users.get(login);
    }

    public boolean containsLogin(String login) {
        return users.containsKey(login);
    }
}
