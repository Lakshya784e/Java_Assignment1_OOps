import java.util.Scanner;
class ques1{
    public static void main(String[] args) {
        try (//to find celsius to farenheit 
Scanner sc = new Scanner(System.in)) {
    System.out.println("Choose 1 for converting temperature from celsius to farenheit");
    System.err.println("and choose 2 for vice versa");
    int p = sc.nextInt();
            switch (p) {
                case 1 -> {
                    System.out.println("Enter temperature ");
                    double c = sc.nextDouble();
                    double f = (double)((c*9.0)/5) + 32.0;
                    System.out.println("Farenheit: " + f);
                    System.err.println("Celsius: " + c);
                }
                case 2 -> {
                    System.out.println("Enter temperature ");
                    double ft = sc.nextDouble();
                    double ct = (double)(((ft-32.0)*5.0)/9);
                    System.out.println("Farenheit: " + ft);
                    System.err.println("Celsius: " + ct);
                }
                default -> System.out.println("Invalid chosen");
            }
}

    }
}