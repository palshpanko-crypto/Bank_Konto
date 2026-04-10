
public class UserService {

    private boolean passwordCheck(User user, String passwordConfirm) {
        return user.getPassword().equals(passwordConfirm);
    }

    public boolean login(User user, String password) {
        return passwordCheck(user, password);
    }
}
