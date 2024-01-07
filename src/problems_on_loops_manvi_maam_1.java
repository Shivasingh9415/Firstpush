//given 2 numbers a and b. Find a raise to the power b.
import java.util.*;
 class problems_on_loops_manvi_maam_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers a and b : ");
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 1;

        for(int i =1; i<=b; i++){
            ans *=a;

        }
        System.out.println(ans);


















// print the first n factorial numbers.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n  = sc.nextInt();
//        int fact =1;
//
//        for(int i =1; i<=n; i++){
//            fact = fact*i;
//            System.out.println(fact);
//        }



















        // find he sum of the following series. (1-2+3-4+5-6....n)
//        int ans =0;
//
//        for(int i =1; i<=n; i++){
//            if(i%2 != 0){
//                ans += i;
//            }
//            else{
//                ans -= i;
//            }
//        }
//        System.out.println(ans);
//
//












//        int sum1 = 0;
//        int sum2 = 0;
//        int sum3;
//
//        for(int i=1; i<=n; i++){
//            if(i%2 != 0){
//                sum1 = sum1+i;
//            }
//            else{
//                sum2 = sum2+i;
//            }
//
//        }
//        sum3 = sum1-sum2;
//        System.out.println(sum3);



















        // Reverse the digits of a number.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = sc.nextInt();
//        int ans =0;
//        int original_n = n;
//
//        while(n>0){
//            ans = (ans*10) + (n%10);
//            n = n/10;
//        }
//
//        System.out.println("Reverse of " + original_n + " is " + ans);
//

        






























//find the sum of digits in a given number n.
//        int sumOfDigits = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//
//        while(n>0){
//            sumOfDigits = sumOfDigits + n%10;
//            n = n/10;
//
//        }
//        System.out.println(sumOfDigits );















//count the number of digits for a given number n.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int numOfDigits = 0;
//        int original_n = n;
//
//        while(n>0){
//            n = n/10;
//            numOfDigits++;
//        }
////        System.out.println("Number of digits in " + original_n + " is " + numOfDigits);

    }
}
