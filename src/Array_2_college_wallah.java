import java.util.*;
public class Array_2_college_wallah {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] num = new int[n];


        System.out.println("Enter " + n + " elements");
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        for(int i =0; i<num.length; i++){
            System.out.print( num[i] + " " );
        }
// Array reference in java
//         trying to copy num in num_1
        int[] num_1 = num;


    }
}
