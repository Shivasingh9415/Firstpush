import java.util.*;
public class loops_practice_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int max = n;
        int min = n;
        if(n>=0) {
            while (true) {
                System.out.println("Enter your number: ");
                n = sc.nextInt();

                if(n<0){
                    break;
                }

                if (n > max) {
                    max = n;
                }

                if (n < min) {
                    min = n;
                }
            }
            System.out.println("min = " + min + " max = "+ max);

        }
       else{
           System.out.println("Invalid number print numbers greater than 0");
       }






























//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i =1; i<n; i++){
//            if(n%i==0){
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum == 1 ? "prime" : "Not prime");

    }
}
