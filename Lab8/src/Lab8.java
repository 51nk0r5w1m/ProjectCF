import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            DecimalFormat df = new DecimalFormat("$#,##0.00");

            // Write headers to output file
            bw.write("EmpID,Rate,Hours,Weekly Pay");
            bw.newLine();

            // Skip the header row in input file
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length < 3) continue;

                String name = parts[0];
                double payRate = Double.parseDouble(parts[1]);
                double hoursWorked = Double.parseDouble(parts[2]);

                double weeklyPay;
                if (hoursWorked > 40) {
                    double overtime = hoursWorked - 40;
                    weeklyPay = (40 * payRate) + (overtime * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                String outputLine = name + "," + payRate + "," + (int) hoursWorked + "," + df.format(weeklyPay);
                bw.write(outputLine);
                bw.newLine();
            }

            System.out.println("Output written to " + outputFile);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Data format error: " + e.getMessage());
        }
    }
}
