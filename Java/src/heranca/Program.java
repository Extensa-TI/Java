package heranca;

public class Program {

    public static void main(String[] args) {
        
        BusinessAccount account = new BusinessAccount();

        System.out.println(account.getBalance());
        
        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
