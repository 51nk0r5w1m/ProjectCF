import javax.swing.JOptionPane;

// This class determines the grade for an exam.

public class Exam extends Assessment {
    private int numMissed;     // Number of questions missed
    private int pointsEach;    // Point(s) each question is worth

    // The constructor sets the number of questions on the exam and the number of questions missed.

    //  Runtime exception to signal a method has received an illegal or inappropriate argument.
    public Exam(int questions, int missed) {
        try {
            if (questions <= 0) {
                throw new IllegalArgumentException("Number of questions must be positive");
            }
            if (missed < 0) {
                throw new IllegalArgumentException("Number of missed questions cannot be negative");
            }
            if (missed > questions) {
                throw new IllegalArgumentException("Number of missed questions cannot be greater than total questions");
            }

            // Number of questions on the exam
            numMissed = missed;

            // Calculate points per question (100 points total)
            pointsEach = 100 / questions;

            // Calculate and set the score
            int score = (questions - numMissed) * pointsEach;
            setScore(score);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(1);  // Exit with error code
        }
    }

    // The getPointsEach method returns the number of point(s) each question is worth.

    public int getPointsEach() {
        return pointsEach;
    }

    // The getNumMissed method returns the number of questions missed.

    public int getNumMissed() {
        return numMissed;
    }
}