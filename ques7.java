
import java.util.Scanner;

public class ques7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = sc.nextInt();
        System.out.print("Grade: ");
if(p>=90)
        System.out.print("A");

   else if(p>=80)
                System.out.print("B");
                
           else if(p>=70)
                System.out.print("C");
                
            else if(p>=60)
                System.out.print("D");
                
            else if(p>=40)
                System.out.print("E");
                   
            else{
                System.out.println("F");
            }
        }
    }
