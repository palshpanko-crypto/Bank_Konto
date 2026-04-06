package repository;
import java.util.HashMap;
import java.util.Map;
import model.Transaction;
public class TransactionRepository {
    private Map<String, Transaction> transactions = new HashMap<>();
    public void addTransaction(Transaction transaction) { transactions.put(transaction.getId(), transaction); } //getId = TransactionId
    public Transaction getTransaction (String id) {return transactions.get(id); }
    public boolean exists(String id) {return transactions.containsKey(id); }
    
}
