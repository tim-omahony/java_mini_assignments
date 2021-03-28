package ma3;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    public Account(int id, double balance, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return (this.balance*this.annualInterestRate)/12;
    }

//  this method raises an exception if the balance after the withdrawal is less than 0.
    public double withdraw(double withdrawAmount) throws Exception {
        if (this.balance - withdrawAmount < 0) {
            throw new Exception("Balance is too low :(");
        }
        this.balance = this.balance - withdrawAmount;
        return withdrawAmount;
    }

    public double deposit( double depositAmount) {
        this.balance = this.balance + depositAmount;
        return this.balance;
    }

    public String toString() {
        return "Account details: " +
                "\n id =" + id +
                "\n balance=" + balance +
                "\n dateCreated=" + dateCreated;
    }
}

