
import java.util.Scanner;  // Import the Scanner class to get user input

public class Runner {

    // Main method - instantiates Pet objects and prints their state
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to get user input


        // First Pet object using default constructor
        Pet2 myPetFirst = new Pet2();  //  Instantiates pet with default values
        System.out.println(myPetFirst);  // Calls toString() to print pet's details

        System.out.println();  // Line space

        // Second Pet object using custom constructor
        Pet2 myPetSecond = new Pet2("L33t", "Dog", 1);  // Instantiates pet with given values
        System.out.println(myPetSecond);  // Calls toString() to print pet's details

        // Third Pet object takes user input
        System.out.println("\nEnter animal type:");
        String type = scanner.nextLine(); // Reads pet type
        System.out.println("Enter animal name:");
        String name = scanner.nextLine(); // Reads pet name
        System.out.println("Enter animal age:");
        int age = scanner.nextInt(); // Reads pet age

        Pet2 myPetThird = new Pet2(name, type, age); // Creates pet object with user inputs
        System.out.println("\n" + (myPetThird)); // Prints pet's details

        scanner.close(); // Closes the scanner
    }
}




