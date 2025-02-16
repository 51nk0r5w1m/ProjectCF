/*
 * The Runner class serves as the entry point to the program.
 * It creates an instance of the Tests class, calls the getAverage() method
 * to allow user input, and then prints the results.
 */
public class Runner {
    public static void main(String[] args) {
        // Create an instance of the Tests class
        Tests tests = new Tests();

        // Prompt the user to enter test scores and compute the average
        tests.getAverage();

        // Display the formatted results using the toString() method
        System.out.println(tests);
    }
}

