import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Welcome to our Bank!!!!");
        System.out.println("---------------------------------");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        System.out.println("---------------------------------");
        second obj = new second();
        int Option;
        int pin;
        Option = sc.nextInt();
        switch(Option){
            case 1:
                System.out.print("Enter your pin:");
                pin = sc.nextInt();
                System.out.println("---------------------------------");
                if(pin == 9800) {
                    System.out.print("Enter the Amount to withdraw:");
                    int withdraw = sc.nextInt();
                    obj.WithDraw(balance, withdraw);
                }
                else
                    System.out.println("Invalid Pin!!!!!");
                break;
            case 2:
                System.out.print("Enter your pin:");
                pin = sc.nextInt();
                System.out.println("---------------------------------");
                if(pin == 9800) {
                    System.out.print("Enter the amount to deposit:");
                    int depositamount = sc.nextInt();
                    obj.Deposit(balance, depositamount);
                }
                else
                    System.out.println("Invalid Pin!!!!!");
                break;
            case 3:
                System.out.print("Enter your pin:");
                pin = sc.nextInt();
                System.out.println("---------------------------------");
                if(pin == 9800)
                    obj.displayBalance(balance);
                else
                    System.out.println("Invalid Pin!!!!!");
                break;
        }
    }
}
