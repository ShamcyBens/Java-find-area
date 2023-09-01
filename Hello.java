import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");  // /Prompt for the length
        double length = scanner.nextDouble(); //Double refers to the data type while "length" refers to thevariable that will hold the answer
 
        System.out.print("Enter the width: "); //Prompt for the width
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("The area is: " + area); //Output the area

        // Remember to close the scanner when you're dealing with it
        scanner.close();
    }
}
