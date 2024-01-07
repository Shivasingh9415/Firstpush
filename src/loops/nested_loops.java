package loops;
import java.util.*;
public class nested_loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        for(int i =1; i<=r; i++){
            for(int j =1; j<=r-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(k);
            }
            for(int l = i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }

























//        Numerical Pattern
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int r = sc.nextInt();
//        for(int i = 1; i<=r; i++){
//            for(int j = i; j<=r; j++){
//                System.out.print(j);
//            }
//            for(int k = 1; k<i; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }














//       *
//      ***
//     *****
//    *******
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        for(int i = 1; i<=r; i++){
//            for(int j = 1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k<=2*i-1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

















//        ****
//        ***
//        **
//        *
//        int r =5;
//        for(int i=1; i<=r; i++){
//            for(int j = 1; j<=(r+1-i); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }












//        *
//        **
//        ***
//        ****
//        int r = 4;
//        for(int i =1; i<=r; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }








//        ******
//        *    *
//        *    *
//        ******
//        int r = 4;
//        int c = 5;
//        for(int i =1; i<=r; i++){
//            for(int j = 1; j<=c; j++ ){
//                if(i == 1 || i == r || j == 1 || j == c){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }





//    for ******
//        ******
//        ******
//        for(int i =0; i<3; i++){
//            for(int j =1; j<=6; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
    }

}
