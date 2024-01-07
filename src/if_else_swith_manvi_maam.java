import java.util.*;
public class if_else_swith_manvi_maam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
//        if(num%2 == 0 || num%3 == 0){
//            System.out.println("Number is even");
//        }
//        else {
//            System.out.println("Number is odd");
//        }

//        using ternary operator
        String ans;
        ans = (num%2 == 0) ? "even" : "odd";
        System.out.println(ans);
    }
}
