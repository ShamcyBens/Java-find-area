import java.util.Scanner;


public class project{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting our simple project");

        System.out.println("Welcome, This application is a simple project that will be used to calculate Area of Rectangle");
        System.out.println("Please enter the lenght:");//This is the lenght of the rect
        double length = scanner.nextDouble();

        System.out.println("Enter your width: "); //This is the width of the rect
        double width = scanner.nextDouble();
       
        double area = length * width;
        System.out.println("The area of a rectangle is : " + area);
        scanner.close();
    }
}


