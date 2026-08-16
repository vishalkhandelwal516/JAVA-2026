import java.util.*;
public class MarksProcessor {
    static double calculateAverage(double sum, int count) {
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

    static void displaySummary(int count, double sum, double average, int highest, int passes, int failures) 
    {
        System.out.println("Number of valid marks entered: " + count);
        System.out.println("Sum of the marks: " + sum);
        System.out.println("Average mark:" + average);
        if (count > 0) {
            System.out.println("Highest mark: " + highest);
        } else {
            System.out.println("Highest mark: No data");
        }


        System.out.println("Number of passes (>= 50): " + passes);
        System.out.println("Number of failures (< 50): " + failures);
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        System.out.println("Enter marks between 0 and 100. Enter -1 to stop.");

        while (true) 
        {
            System.out.print("Enter mark: ");
            int mark = ob.nextInt();
            if (mark == -1) {
                break;
            }
            if (mark>100 || mark < 0) {
                System.out.println("Invalid mark! Marks should be between 0 and 100");
                continue;
            }
            count++;
            sum += mark;
            if (mark > highest) {
                highest = mark;
            }

            if (mark >= 50) {
                passes++;
            } else {
                failures++;
            }
        }
        double average = calculateAverage(sum, count);
        System.out.println("========= DISPLAYING RESULTS =========");
        displaySummary(count, sum, average, highest, passes, failures);
    }
}