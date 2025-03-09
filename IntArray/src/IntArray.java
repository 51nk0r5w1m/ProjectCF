import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Private data fields for your IntArray class
    private int length;     // Stores the number of elements in the array
    private int myArray[];  // Array to store integer values

    // Constructor: Initializes the array with the given size
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[l]; // Allocates memory for the array
    }

    // Returns the size of the array
    public int size() {
        return length;
    }

    // Fills the array with random numbers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1; // Generates numbers from 1 to 6
        }
    }

    // Returns the value at the given index, or -1 if index is out of range
    public int get(int element) {
        if (element >= 0 && element < length) {
            return myArray[element]; // Return the value at the valid index
        }
        return -1; // Return -1 if index is invalid (instead of throwing an exception)
    }

    // Sets a specific element in the array to a new value (only if valid)
    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue; // Assign the new value to the given index
        }
    }

    // Checks if the array is empty (all elements are zero)
    public boolean isEmpty() {
        for (int num : myArray) {
            if (num != 0) {
                return false; // If any element is not zero, the array is not empty
            }
        }
        return true; // If all elements are zero, return true
    }

    // Clears the array by setting all elements to zero
    public void clear() {
        Arrays.fill(myArray, 0); // Efficiently fills the entire array with zeros
    }

    // Sorts the array in ascending order
    public void sort() {
        Arrays.sort(myArray); // Uses Java's built-in sorting method
    }

    // Converts the array to a readable string format (matches professor's format)
    public String toString() {
        // Start with a header to indicate that the array data is being displayed
        String result = "IntArray instance data:\n";

        // Loop through each element in the array
        for (int i = 0; i < length; i++) {
            // Append the element index and value to the result string
            result += "Element " + i + ": " + myArray[i] + "\n";
        }

        // Return the formatted string containing all elements
        return result;
    }
}
