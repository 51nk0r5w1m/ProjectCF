import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests {
    private double ave;  // Stores the average score
    private int count;   // Stores the count of scores entered
    private int score;   // Stores the most recent score entered

    // Constructor
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;
    }

    // Reads test scores from the user, calculates the average
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int numScores = 0;

        System.out.println("Enter test scores (enter -1 to quit):");
        int inputScore = scanner.nextInt();

        while (inputScore != -1) {
            sum += inputScore;
            numScores++;
            score = inputScore; // Store the last entered score
            System.out.println("Enter test scores (enter -1 to quit):");
            inputScore = scanner.nextInt();
        }

        if (numScores > 0) {
            ave = sum / numScores;
        } else {
            ave = Double.NaN; // No valid scores entered
        }

        count = numScores; // Store the count of scores entered
    }

    // Getter for average
    public double getAve() {
        return ave;
    }

    // Getter for count
    public int getCount() {
        return count;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int newScore) {
        this.score = newScore;
    }

    // toString method to display formatted output
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "The average of the " + count + " scores entered is " + df.format(ave) + ".";
    }
}
