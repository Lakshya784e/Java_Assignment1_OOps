import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i + ":");
            System.out.print("Mathematics: ");
            int math = sc.nextInt();
            System.out.print("Physics: ");
            int physics = sc.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = sc.nextInt();

            int total = math + physics + chemistry;
            int mathPhysicsTotal = math + physics;

            if (math >= 60 && physics >= 50 && chemistry >= 40 &&
                    (total >= 200 || mathPhysicsTotal >= 150)) {
                System.out.println("Student " + i + " is eligible.");
            } else {
                System.out.println("Student " + i + " is not eligible.");
            }
        }
    }
}
