package loops;
import java.util.*;
public class loops_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers a: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;

        for(int i=1; i<=b; i++){
            ans = ans*a;
        }
        System.out.println(ans);




//        int factorial =1;
//        for(int i =1; i<=n; i++){
//            factorial = factorial*i;
//            System.out.println(factorial);
//        }

    }
}
