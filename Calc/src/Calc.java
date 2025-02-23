public class Calc {
    // Private fields to store the numbers
    private double num1;
    private double num2;

    // Getter for num1
    public double getNum1() {
        return num1;
    }

    // Setter for num1
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Getter for num2
    public double getNum2() {
        return num2;
    }

    // Setter for num2
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Method to add num1 and num2
    public double add() {
        return num1 + num2;
    }

    // Method to subtract num2 from num1
    public double subtract() {
        return num1 - num2;
    }

    // Method to multiply num1 and num2
    public double multiply() {
        return num1 * num2;
    }

    // Method to divide num1 by num2
    public double divide() {
        // Check to avoid division by zero
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return num1 / num2;
    }

    // toString method to display the private fields
    public String toString() {
        return "Displaying private data fields using toString():\n" +
                "Num1: " + num1 + "\n" +
                "Num2: " + num2;
    }
}

