package BankApp;

public class BankCustomer extends BankOperation implements PaymentService {
    private Customer customer;


    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new AmoundException("Məbləğ sıfırdan böyük olmalıdır!");
        }
        customer.updateBalance(amount);
        System.out.println("Balans artırıldı: " + amount);
    }

    @Override
    public double checkBalance() {

        return customer.getBalance();
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            throw new AmoundException ("Məbləğ sıfırdan böyük olmalıdır!");
        }
        if (customer.getBalance() < amount) {
            throw new AmoundException("Balans kifayət etmir!");
        }
        customer.updateBalance(-amount);
        System.out.println("Ödəniş edildi: " + amount);
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0) {
            throw new AmoundException("Məbləğ sıfırdan böyük olmalıdır!");
        }
        customer.updateBalance(amount);
        System.out.println("Pul geri qaytarıldı: " + amount);
    }

}

