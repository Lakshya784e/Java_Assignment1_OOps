import java.util.Arrays;
import java.util.Scanner;

public class ques22 {
    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);

        // Input: number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input: array elements
        double[] numbers = new double[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Find the median
        double median;
        if (n % 2 == 0) {
            // If even, median is the average of the two middle numbers
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            // If odd, median is the middle number
            median = numbers[n / 2];
        }

        // Output the median
        System.out.println("The median is: " + median);
    }
}
