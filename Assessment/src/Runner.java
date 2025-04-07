import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

    public static void main(String[] args)
    {
        String input;     // To hold input
        int questions = 0;    // Number of questions
        int missed = 0;       // Number of questions missed
        boolean validInput = false;

        // Get the number of questions on the exam
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                questions = Integer.parseInt(input);
                if (questions <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive number of questions.");
                    continue;
                }
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }

        validInput = false;
        // Get the number of questions the student missed
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                missed = Integer.parseInt(input);
                if (missed < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a non-negative number of missed questions.");
                    continue;
                }
                if (missed > questions) {
                    JOptionPane.showMessageDialog(null, "Number of missed questions cannot be greater than total questions.");
                    continue;
                }
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }

        // Create an Exam object
        try {
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.exit(0);
    }
}