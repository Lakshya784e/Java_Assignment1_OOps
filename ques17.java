import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        //to find hcf
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int n1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int n2 = sc.nextInt();
        int max = Math.max(n1,n2);
       while (true) { 
           if(max%n1==0 && max%n2==0){
            System.out.println("LCM OF " + n1 + " and " + n2 + " is " + max);
            break;
           }
           max++;
       }
       
    }
}
