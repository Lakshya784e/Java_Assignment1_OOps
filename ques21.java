import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        System.out.println("Binary to Decimal: " + decimal);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        StringBuilder binaryResult = new StringBuilder();

        while (decimalNum > 0) {
            binaryResult.insert(0, decimalNum % 2);
            decimalNum /= 2;
        }
        System.out.println("Decimal to Binary: " + binaryResult);
    }
}
