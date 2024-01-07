import java.util.*;
public class loops_in_java_manvi_maam {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        int num =1 ;
        while(num<=n){
            System.out.println(num);
            sum = sum + num;
            num++;
        }
        System.out.println("Value of sum is: " + sum);

    }
}
