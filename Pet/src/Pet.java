// Carley Fant
// Module 2: Assignment 2


public class Pet {
    // Private data field [Encapsulation] for pet's name
    private String name;

    // Default constructor [initializes name to "Pet Name" as per assignment output example]
    public Pet() {
        this.setName("Pet Name");  // Calls set method in constructor
    }

    // Public setter [mutator] method for the name field
    public void setName(String newName) {
        this.name = newName;  // Updates the name
    }

    // Public getter [accessor] method for the name field
    public String getName() {
        return this.name;  // Returns the pet's name
    }

    /*
     * Public toString method that prints all the object state [meaning the data in the object instance that
     * you will later instantiate in the main() method]
     *
     */


    // Public toString() method that returns the object state in String format
    public String toString() {
        String output = "Pet information:\n"; // Ensures output matches example
        output += "Name: " + this.getName();  // Concatenates name to output
        return output;
    }


    // Main method - instantiates Pet objects and prints their state
    public static void main(String[] args) {
        // First Pet object (uses default state)
        Pet myPet1 = new Pet();
        System.out.println(myPet1);  // Calls toString() automatically

        System.out.println();  // Print extra line for spacing

        // Second Pet object [sets name using setName()]
        Pet myPet2= new Pet();
        myPet2.setName("L33t");  // Uses set method to set the name field
        System.out.println(myPet2);  // Calls toString() automatically
    }
}


