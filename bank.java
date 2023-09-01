import java.util.Scanner;

public class bank {

    public static void main(String[] args) {
        banking(); //These are classes that I have created and stored in main ...
        looping_through(); // ...class so that everytime i compile, it will also execute the classes (functions in python)

}    

    public static void banking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" --- Welcome to BB Banking site ---");
        System.out.println(" --- Follow these simple procedures to register ---");

        System.out.print("   1. What is your Name? ");
        String name = scanner.nextLine();

        System.out.print("   2. What is your age? ");
        int age = scanner.nextInt(); // Changed to int

        System.out.println("Thank you " + name + ", for signing up to our web with your details");
        System.out.print("Please confirm that these details belong to you (y/N): ");
        scanner.nextLine(); // Consume the newline left in the buffer
        String answer = scanner.nextLine();
        String ans = answer.toLowerCase();

        if (ans.equals("y")) {
            System.out.println("Correct, we can move to the next step now :-)");
        } else {
            System.out.println("Apologies:-( " + name + ", let us fix that then");
        }

        scanner.close();
    }

    public static void looping_through(){
        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }
    }

    
}
4