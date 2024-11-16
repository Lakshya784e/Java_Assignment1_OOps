import java.util.Scanner;
public class ques10 {
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }

return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Fibonacci " + r + "th term: " + fibonacci(r));
    }
}