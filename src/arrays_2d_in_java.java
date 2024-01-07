import java.util.*;
public class arrays_2d_in_java {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        for(int i =1; i<=n/2; i++){
            if(n%i== 0){
                sum = sum+i;
                System.out.print(sum);
            }
        }




//        Write a program which reads a sequence of integers from the user and stops by displaying DONE when the sum of these values exceeds 100
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        if(true) {
//            for (int i = 0; i <= 100; i++) {
//                System.out.println("Enter your number: ");
//                sum = sum + sc.nextInt();
//
//                if (sum > 100) {
//                    break;
//                }
//            }
//        }
//        System.out.println("Done "+ sum);
//
//
//
//
//
//        while(true){
//            System.out.println("Enter your number: ");
//            sum = sum+sc.nextInt();
//
//            if(sum>100){
//                break;
//            }
//
//        }
//        System.out.println("Done" + sum);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        System.out.println("Enter your number: ");
////        int n = sc.nextInt();
////        for(int i = 100; i>=n; i--){
////            if(i%2 == 0){
////                System.out.println(i);
////            }
////
////        }
//
//
//
//
//
//
//
//
//
////        int factorial = 1;
////        int i = 1;
////        while(i<=n){
////            factorial = factorial*i;
////            i++;
////        }
////        System.out.println(factorial);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        for(int i =10 ; i>=1; i--){
////            System.out.println(n*i);
////        }
////
//
//
//
//
//
//
//
//
////        int n = sc.nextInt();
////        for(int i =0; i<n; i++){
////            sum = sum+(2*i);
//////            System.out.println("The sum of "+ n + "numbers is " + sum);
////
////        }
////        System.out.println("The sum of "+ n + " numbers is " + sum);
//
//
//
//
    }
}
