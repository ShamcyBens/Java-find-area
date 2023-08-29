import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");  // This is my length
        double length = scanner.nextDouble();
 
        System.out.print("Enter the width: "); //This is my width
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("The area is: " + area);

        // Remember to close the scanner when you're done with it
        scanner.close();
    }
}
