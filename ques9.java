import java.util.Scanner;
public class ques9 {
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        //just add 12 if you want 12,factorial
        System.out.println("Factorial of r is" + factorial(r));
    }
}
