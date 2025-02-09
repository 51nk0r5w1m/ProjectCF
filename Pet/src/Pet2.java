// Carley Fant
// Module 3: Assignment 1


public class Pet2 {
    // Private data field [Encapsulation] for pet's attributes
    private String name;
    private String type;
    private int age;

    // Custom constructor [initializes fields with default values]
    public Pet2() {
        this.setName("Pet Name");  // Calls set method in constructor
        this.setType("Animal");
        this.setAge(1);
    }

    // Custom constructor [Sets initial values for all fields using setter method]
    public Pet2(String name, String type, int age) {
        this.setName(name);  // Sets name
        this.setType(type);  // Sets type
        this.setAge(age);  // Sets age
    }

    // Public setters [Mutators - Used to update the values of private fields]
    public void setName(String newName) {
        this.name = newName;  // Updates pet's name
    }

    public void setType(String newType) {
        this.type = newType;  // Update pet's type
    }

    public void setAge(int newAge) {
        this.age = newAge;  // Updates pet's age
    }

    // Getter methods [Accessors - Used to retrieve the values of private fields]
    public String getName() {
        return this.name;  // Returns the pet's name
    }
    public String getType() {
        return this.type;  // Returns pet's type
    }
    public int getAge() {
        return this.age;  // Returns pet's age
    }

    // speak() method [Determines the sound the pet makes base on its type]
    public String speak() {
        if (this.getType().equalsIgnoreCase("dog")) {
            return "Woof";  // Dog's sound
        }  else if (this.getType().equalsIgnoreCase("cat")) {
            return "Meow";  // Cat's sound
        }  else {
            return "Yowl"; // Default sound for other pets
        }
    }


    // toString() method [Returns the formatted state of the Pet object in String format]
    public String toString() {
        String output = "Pet information:\n"; // Ensures output matches example
        output += "Type: " + this.getType();  // Concatenates Type to output
        output += "\nName: " + this.getName();  // Concatenates Name to output
        output += "\nSound: " + this.speak();
        output += "\nAge: " + this.getAge();
        return output;
    }
}



