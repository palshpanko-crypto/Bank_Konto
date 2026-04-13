
public class TransactionService {

    private final UserRepository userRepository;

    public TransactionService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean transfer(String fromUser, String toUser, double amount) {
        User from = userRepository.getByLogin(fromUser);
        User to = userRepository.getByLogin(toUser);
        if (from == null || to == null) {
            return false;
        }
        if (from.getBalance() < amount){
            return false;
        }
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        return true;

    }
}