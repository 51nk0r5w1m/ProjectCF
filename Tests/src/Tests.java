public class Tests {
    public static void main(String[] args)
    {
        float test1 = 88.2f;
        float test2 = 78.9f;
        float test3 = 97.6f;

        /* Add test scores and divide by number of tests to find average */
        float average = (test1 + test2 + test3)/3;
        float roundedAverage = Math.round(average *100) / 100f;

        System.out.println("Test score 1: " + test1);
        System.out.println("Test score 2: " + test2);
        System.out.println("Test score 3: " + test3);
        System.out.println("The average of 3 test scores is: " + roundedAverage);
    }
}
