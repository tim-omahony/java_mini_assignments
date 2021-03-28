package ma3;
import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(101, 20000, new Date());
        a1.setAnnualInterestRate(0.045);

        System.out.println("Monthly Interest: " + a1.getMonthlyInterest());
        try {
            a1.withdraw(2500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("a1: balance after withdrawal = " + a1.getBalance());

        a1.deposit(3000);
        System.out.println("a1 balance after deposit = " + a1.getBalance());

        System.out.println("a1: date = " + a1.getDateCreated());
    }
}
