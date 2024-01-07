package loops;
import java.util.*;
public class loops_manvi_maam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number n: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            count = count*10+n%10;
            n = n/10;

        }
//            count = count + n%10;
//            n = n/10;
//        }
        System.out.println("Reverse of digits in number n is: "+ count);

    }
}
