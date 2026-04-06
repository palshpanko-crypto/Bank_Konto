package repository;

import java.util.HashMap;
import java.util.Map;
import model.Account;

public class AccountRepository {
    private Map<String, Account> accounts = new HashMap<>();
    public void addAccout(Account account) { accounts.put(account.getAccId(), account); } //idk. should i change accId to Id?? 
    public Account getAccount (String accId) { return accounts.get(accId); }
    public boolean exists(String accId) {return accounts.containsKey(accId); }
}
