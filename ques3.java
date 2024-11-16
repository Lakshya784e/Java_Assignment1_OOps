import java.util.Scanner;
public class ques3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers");
    int n1  = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
System.out.println("Maximum: " + Math.max(n1, Math.max(n2,n3)));
   } 
}
