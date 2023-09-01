import java.util.Scanner;

public class functions{

    public static void main(String[] args){
        sayHi();

    }
    public static void sayHi(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? "); //Prompts for the name
        String name = scanner.nextLine();
        // String myName = name.toLowerCase(); // Declare and convert to lowercase

        if (name.equals("shama") || name.equals("bernard")){
            System.out.println("Hello, "+ name);
        }else {
            System.out.println("Sorry I dont know you, " + name);
        }
        scanner.close();
    }

}

//Python 
/* 
 * name = input("What is your name?")

print("Hello " + name)

*/

