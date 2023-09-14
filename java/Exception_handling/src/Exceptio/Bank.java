package Exceptio;

public class Bank {
    private int balance;
    public Bank() {

    }

    public Bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void deposite(int amt)throws InvalidAmount{
        if (amt<100)
                throw new InvalidAmount();
        balance=balance+amt;
        System.out.println("deposite :"+amt);
    }
    public void withdraw(int amt)throws InsufficientBalance{
        if(amt > balance)
        throw new InsufficientBalance();
        balance=balance-amt;
        System.out.println("withdraw :"+amt);
    }
}






