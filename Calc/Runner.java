//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a Calc object
        Calc myCalculator = new Calc();
        
        // Get user input for two numbers
        Scanner scan = new Scanner(System.in);
        double n1 = getValidNumber(scan, "Please enter the first number: ");
        double n2 = getValidNumber(scan, "Please enter the second number: ");
        
        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);
        
        // Output from Calc instance
        System.out.println(myCalculator);
        
        // Examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());
        
        // Calling Calc methods directly
        System.out.println("The sum is: " + myCalculator.add());
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
    
    // Method to validate numeric input
    private static double getValidNumber(Scanner scan, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                scan.nextLine(); // Consume newline character
                break;
            } else {
                System.out.println("This entry can only contain numbers. Please try again.");
                scan.nextLine(); // Discard invalid input
            }
        }
        return number;
    }
}
