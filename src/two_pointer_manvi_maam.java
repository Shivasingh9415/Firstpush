import java.util.*;
public class two_pointer_manvi_maam {

    static void reverse(int[]arr){
        int n = arr.length;
        int left = 0 , right = n-1;
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }


    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left =0 , right =n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }

            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortTwoPointer(int [] arr){
        int n = arr.length;
        int left = 0 ,  right = n-1;

        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;
//        count the number of zeroes
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }
//        0 to zeroes - 1 tak fill zero else fill 1
        for(int i=0; i<n; i++){
            if(i<zeroes){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }

    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int[] ar_1 = {-10, -4, -2, -1};
        System.out.println("Original Array: ");
        printArray(ar_1);
        System.out.println("Sorted Array: ");
        int[] ans = sortSquares(ar_1);
        reverse(ans);
        printArray(ans);




//        System.out.println("Sorted Array: ");
//        sortTwoPointer(ar_1);
//        printArray(ar_1);

    }
}
