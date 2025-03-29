// This class determines the grade for an exam.

public class Exam extends Assessment {
    private int numQuestions;  // Number of questions on the exam
    private int numMissed;     // Number of questions missed
    private int pointsEach;    // Point(s) each question is worth

    // The constructor sets the number of questions on the exam and the number of questions missed.

    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;

        // Calculate points per question (100 points total)
        pointsEach = 100 / numQuestions;

        // Calculate and set the score
        int score = (numQuestions - numMissed) * pointsEach;
        setScore(score);
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