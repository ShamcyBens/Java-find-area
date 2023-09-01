import java.util.Scanner;

public class BankProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Bank Test Program");

        // Check if the user has an account
        boolean hasAccount = checkForAccount(scanner);

        if (!hasAccount) {
            System.out.println("You do not have an Account. Follow below instructions to register your account");
            String name = getUserName(scanner);
            int accountNumber = getAccountNumber(scanner);
            double accountBalance = getAccountBalance(scanner);
        }

        System.out.println("What's next, Do you want to:");
        System.out.println("To withdraw some cash, enter 1: ");
        System.out.println("To deposit some cash, enter 2: ");

        int choice = scanner.nextInt();

        if (choice == 1 && hasAccount) {
            double accountBalance = getAccountBalance(scanner); // Retrieve the account balance
            double amount = getWithdrawAmount(scanner);

            if (accountBalance < amount) {
                System.out.println("You do not have enough money to withdraw");
            } else {
                accountBalance -= amount;
                System.out.println("You have withdrawn " + amount);
                // Update the account balance in a real application
            }
        } else if (choice == 2 && hasAccount) {
            double accountBalance = getAccountBalance(scanner); // Retrieve the account balance
            double amount = getDepositAmount(scanner);
            accountBalance += amount;
            System.out.println("You have deposited " + amount);
            // Update the account balance in a real application
        }

        scanner.close();
    }

    // Function to check if the user has an account
    private static boolean checkForAccount(Scanner scanner) {
        System.out.println("Do you have an Account (y/N)?");
        String ans = scanner.next();
        return ans.equalsIgnoreCase("y");
    }

    // Function to get the user's name
    private static String getUserName(Scanner scanner) {
        System.out.println("Please enter your name: ");
        return scanner.next();
    }

    // Function to get the account number
    private static int getAccountNumber(Scanner scanner) {
        System.out.println("Please enter your account number: ");
        return scanner.nextInt();
    }

    // Function to get the account balance
    private static double getAccountBalance(Scanner scanner) {
        System.out.println("Please enter your account balance: ");
        return scanner.nextDouble();
    }

    // Function to get the withdrawal amount
    private static double getWithdrawAmount(Scanner scanner) {
        System.out.println("Please enter the amount you wish to withdraw: ");
        return scanner.nextDouble();
    }

    // Function to get the deposit amount
    private static double getDepositAmount(Scanner scanner) {
        System.out.println("Please enter the amount you wish to deposit: ");
        return scanner.nextDouble();
    }
}
