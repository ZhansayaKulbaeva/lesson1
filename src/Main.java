public class Main {
    public static void main(String[] args) {
        BankAccountTwo acc = new BankAccountTwo();
        acc.deposit(100);
        acc.deposit(600);
        acc.deposit(1000);
        acc.withdraw(100);
        System.out.println(acc.getBalance());
    }
}
