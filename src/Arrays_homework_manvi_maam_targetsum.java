import java.util.*;
public class Arrays_homework_manvi_maam_targetsum {

    static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int secondMin(int[] arr){
        int min = minimum(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = minimum(arr);
        return secondMin;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Second minimum array in the list is: " + secondMin(arr));

    }
}
