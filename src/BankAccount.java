public class BankAccount {
    private double balance;

    public BankAccount() {

    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("ERROR");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}