// Asn5.java
import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // First ArrayList: Star Wars characters (Strings)
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Luke Skywalker");
        characters.add("Darth Vader");
        characters.add("Leia Organa");
        characters.add("Obi-Wan Kenobi");

        // Second ArrayList: Power levels (Integers)
        ArrayList<Integer> powerLevels = new ArrayList<>();
        powerLevels.add(85);
        powerLevels.add(95);
        powerLevels.add(80);
        powerLevels.add(90);

        // Display original contents using enhanced for loop
        System.out.println("Original Star Wars Characters:");
        for (String character : characters) {
            System.out.println(character);
        }

        System.out.println("\nOriginal Power Levels:");
        for (int power : powerLevels) {
            System.out.println(power);
        }

        // Use two more ArrayList methods: remove() and add()
        characters.remove("Leia Organa");
        powerLevels.remove(Integer.valueOf(80)); // remove by value, not index

        characters.add("Yoda");
        powerLevels.add(100);

        // Display updated contents
        System.out.println("\nUpdated Star Wars Characters:");
        for (String character : characters) {
            System.out.println(character);
        }

        System.out.println("\nUpdated Power Levels:");
        for (int power : powerLevels) {
            System.out.println(power);
        }
    }
}

