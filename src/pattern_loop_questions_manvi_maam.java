//rectangular pattern
//******
/*
1
12
123
1234
 */
import java.util.*;
public class pattern_loop_questions_manvi_maam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

























/* 121212
   212121
   121212
   212121
 */
//        for(int i=1; i<=r; i++){
//            for(int j =1; j<c; j++){
//                if((i+j)% 2 == 0){
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(2);
//                }
//            }
//            System.out.println(" ");
//        }





















 /* 123456
    123456
    123456
    123456

  */

//        for(int i =1; i<=r; i++){
//            for(int j = 1; j<=r+2; j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
////        we can also print this using rows and columns both.



























/* 1234567
   2345671
   3456712
   4567123
   5671234
   6712345
   7123456
 */
//        for(int i=1;i<=r; i++){
//            for(int j =i; j<=r; j++){
//                System.out.print(j);
//            }
//            for(int k =1; k<=i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println(" ");
//        }

















//*
//**
//***
//****
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows : ");
//        int r = sc.nextInt();
//        for(int i =1; i<=r; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



















//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                if(i == 1 || i ==r || j == 1 || j == c)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


























        //print the following pattern
//******
//******
//******


//        for(int i = 1; i<=3; i++){
//            for(int j=1; j<=6; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
}
