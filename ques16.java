
import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        //to find hcf
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int n1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int n2 = sc.nextInt();
        int sm = Math.min(n1,n2);
        int hcf = 1;
        for(int i = 2; i<=sm; i++){
            if(n1 % i == 0 && n2 % i ==0){
hcf = i;
            }
        }
        System.out.println("HCF of " + n1 + " and " + n2 + " is " + hcf );
    }
}
