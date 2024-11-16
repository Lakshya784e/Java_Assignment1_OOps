import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int number = sc.nextInt();
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
