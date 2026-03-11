package Assigments;

public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int acc, double bal){
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }

    void display(){
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args){
        BankAccount acc = new BankAccount(101,5000);
        acc.deposit(1000);
        acc.withdraw(500);
        acc.display();
    }
}
