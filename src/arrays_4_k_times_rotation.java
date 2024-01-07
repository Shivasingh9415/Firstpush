import java.util.*;
public class arrays_4_k_times_rotation {

    static void swap( int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int[] arr , int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int [] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr , 0 , n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }



//    static int[] rotate(int[] arr, int k){
//        int n = arr.length;
//        k = k%n;
//        int[] ans = new int[n];
//        int j =0;
//
//        for(int i = n-k; i<n; i++){
//            ans[j++] = arr[i];
//        }
//
//        for(int i = 0; i<n-k; i++){
//            ans[j++] = arr[i];
//
//        }
//        return ans;
//    }

    static void printarray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrr = {1,2,3,4,5};
        for(int i =0; i<arrr.length; i++){
            System.out.print(arrr[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        rotateInPlace(arrr, n);
//        int[] ans = rotate(arrr, n);
        printarray(arrr);

    }
}