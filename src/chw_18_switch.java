import java.util.Scanner;

public class chw_18_switch {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced");
        } else if (age>46){
            System.out.println("You are semi experinced");
        }
        else if(age>30){
            System.out.println("You are semi semi experinced");
        }
        else {
            System.out.println("you are a beginner");
        }

    }
}
