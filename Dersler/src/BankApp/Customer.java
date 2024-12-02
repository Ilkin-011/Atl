package BankApp;

public class Customer {
    private String name;
    private int Id;
    private double balance;

    public Customer(String name, int id, double balance) {
        this.name = name;
        Id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}