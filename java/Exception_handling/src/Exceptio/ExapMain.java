package Exceptio;

public class ExapMain {
    public static void main(String[] args) {
        Bank b = new Bank(10000);
        System.out.println("Balance : " + b.getBalance());
        try {
            b.deposite(1500);
        } catch (InvalidAmount e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance :" + b.getBalance());
        try {
            b.withdraw(2500);
        } catch (InsufficientBalance e) {

            System.out.println(e.getmessage());
        }
        System.out.println("Balance :" + b.getBalance());


    }
}
