//check if the given array is sorted or not
import java.util.*;
public class array_practice_part_2_college_wallah {
    static boolean sortedArray(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = tb.nextInt();
        int[] arrr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<arrr.length; i++ ){
            arrr[i] = tb.nextInt();
        }

        System.out.println("Is sorted" + sortedArray(arrr));


    }
}
