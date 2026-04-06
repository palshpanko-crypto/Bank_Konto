package model;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String fromAccountId;
    private String toAccountId;
    private double amount;
    private LocalDateTime timestamp;
    private String status;
    public Transaction(String id, String fromAccountId, String toAccountId, double amount, LocalDateTime timestamp, String status){
        this.id = id;
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.status = status;
    }
    public String getId(){return id;}
    public String getFromAccountId(){return fromAccountId;}
    public String getToAccountId(){return toAccountId;}
    public double getAmount(){return amount;}
    public LocalDateTime getTimestamp(){return timestamp;}
    public String getStatus(){return status;}


    
}
