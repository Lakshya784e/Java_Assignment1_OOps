import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");

        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        
        double average = (double) sum / n;

        
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }
}
