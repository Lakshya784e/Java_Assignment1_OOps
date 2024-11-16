import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to be divided");
    int r1 = sc.nextInt();
    System.out.println("Enter the divisor");
int r2 = sc.nextInt();
if(r1%r2==0){
    System.out.println("Yes");
}
else{
System.out.println("No");
}
    }
}
