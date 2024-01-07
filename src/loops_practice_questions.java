import java.util.*;

// Write a program which reads a positive number N from the user then indicates if N is a prime number or not.


public class loops_practice_questions {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int sum = 0;
//        System.out.println("Enter your number: ");
//       int n = sc.nextInt();
//       for(int i =1; i<n/2 ;i++){
//           if(n%i == 0){
//               sum = sum+i;
//
//           }
//       }
//        System.out.println(sum == 1 ? "prime" : "not prime");

//       2nd way

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = sc.nextInt();
//
//        boolean isprime = true;
//        for(int i =2; i<n; i++){
//            if(n%i == 0) {
//                isprime = false;
//                break;
//            }
//        }
//        System.out.println(isprime ? "Prime" : "Not Prime");

// Write a program which reads a sequence of positive integers. The program stops when the user fills a negative value and shows the maximum and minimum of the numbers you entered previously.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//         int n = sc.nextInt();
//         int max = n;
//         int min = n;
//
//         if(n>=0){
//             while(true){
//                 System.out.println("Enter your number: ");
//                 n = sc.nextInt();
//
//                 if(n<0){
//                     break;
//                 }
//                 if(n>max){
//                     max =n;
//                 }
//                 if(n<min){
//                     min = n;
//                 }
//             }
//             System.out.println("min = "+ min + " max = " + max);
//         }
//         else{
//             System.out.println(n + " Number is not valid should be greater than 0");
//         }
//        ques --> Write a program which displays the sum of digits of an integer read from the user.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = sc.nextInt();
//        int sum = 0;
//
//        while(n>0){
//            sum = sum+n%10;
//            n = n/10;
//        }
//        System.out.println("The sum of the numbers is: "+sum);

//     ques --> Write a program that reads an integer n and displays the nth fibonacci number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num = 1;
        int result = 0;
        int v1 = 1;
        int v2 = 1;

        if(n==1 || n ==2){
            System.out.println(num);
        }
        else if(n<0){
            System.out.println("Invalid number");
        }
        else{
            for(int i = 1; i<=n-2; i++){
                result = v1+v2;
                v1 = v2;
                v2 = result;
            }
            System.out.println(result);
        }



    }
}
