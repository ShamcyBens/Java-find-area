import java.util.Scanner;

public class task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        
        System.out.println("Welcome to the Java Bank Test Program");
        System.out.println("Do you have an Account (y/N)?");

        String ans = scanner.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            System.out.println("You have an Account");
        } else {
            System.out.println("You do not have an Account. Follow below instructions to register your account");
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter your account number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Please enter your account balance: ");
            double accountBalance = scanner.nextDouble();            
        }

        System.out.println("Whats next, Do you want to:");
        System.out.println("To withdraw some cash, enter 1: ");
        System.out.println("Do to deposit some cash, enter 2: ");
        
        int choice = scanner.nextInt();

        if (choice==1){
            System.out.println("Please enter the amount you wish to withdraw: ");
            double amount = scanner.nextDouble();
            if (accountBalance < amount){
                System.out.println("You do not have enough money to withdraw");
            } else {
                accountBalance -= amount;
                System.out.println("You have withdrawn " + amount);
                currentBalance += amount;
            }
            
        }

        scanner.close();


    }
    
}
