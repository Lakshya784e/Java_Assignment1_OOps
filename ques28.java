import java.util.Scanner;

public class ques28 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumOfOdd = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                sumOfOdd += num;
            }
        }

        System.out.println("The sum of all odd numbers in the array is: " + sumOfOdd);

    }
}
