import java.util.Scanner;
public class chw_exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your maths marks");
        float maths = sc.nextFloat();
        System.out.println("Enter your science marks");
        float science = sc.nextFloat();
        System.out.println("Enter your history marks ");
        float history = sc.nextFloat();
        System.out.println("Enter your computer marks");
        float computer = sc.nextFloat();
        System.out.println("Enter your english marks ");
        float english = sc.nextFloat();
        float percentage = ((maths + science + history + computer + english)/500.0f) *100;
        System.out.println("percentage");
        System.out.println(percentage);



    }
}
