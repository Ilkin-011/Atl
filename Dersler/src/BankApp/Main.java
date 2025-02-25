package BankApp;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Hüseyn", 12345, 15000);
        BankCustomer bankCustomer = new BankCustomer(customer);

        try {
            System.out.println("Cari balans: " + bankCustomer.checkBalance());

            bankCustomer.deposit(3000);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());

            bankCustomer.pay(2000);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());

            bankCustomer.refund(500);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());

            bankCustomer.pay(1000);  // Kifayət qədər balans yoxdur
        } catch (AmoundException | FundsException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            bankCustomer.deposit(-50); // Səhv məbləğ daxil edilir
        } catch (AmoundException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}

