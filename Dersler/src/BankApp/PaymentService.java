package BankApp;

public interface PaymentService {
    void  pay(double amount);
    void  refund(double amount);
}
