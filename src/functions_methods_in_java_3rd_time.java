import java.util.*;
// firstly we define the return type of function
public class functions_methods_in_java_3rd_time {

    public static void printfactorial(int a){
        if(a<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i = a; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;

    }

//    public static int calculatesum(int a, int b){
//        int sum = a+b;
//        return sum;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number a: ");
        int a = sc.nextInt();
        printfactorial(a);
//        System.out.println("Enter your number b: ");
//        int b = sc.nextInt();
//        int add = calculatesum(a,b);
//        System.out.println("Sum of numbers is: "+ add);



    }
}
