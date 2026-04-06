package model;

public class Account{
    private String accId;
    private String userId;
    private double balance;
    public Account(String accId, String userId, double balance){
        this.accId = accId;
        this.userId = userId;
        this.balance = balance;
    }
    public String getAccId(){return accId;}
    public String getUserId(){return userId;}
    public double getBalance(){return balance;}
    
}
