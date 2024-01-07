import java.util.Arrays;
import java.util.*;
public class arrays_part_3_practice {
    static void smallestandlargestElement(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrr = {1,4,2,3,56,43,50};
        smallestandlargestElement(arrr);

    }
}
