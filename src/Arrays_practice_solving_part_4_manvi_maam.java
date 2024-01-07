import java.util.*;
public class Arrays_practice_solving_part_4_manvi_maam {

//    rotate array from k steps in the same array.
    static void swapForRotate(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseForRotate(int[] arr , int i, int j){
        while(i<j){
            swapForRotate(arr, i, j);
            i++;
            j--;
        }
    }






//     Method to rotate an array by k steps.
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j =0;

        for(int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i =0; i<n-k-1; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }





    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] arrr = new int[n];
        int f = 0;

        for(int i=n-1; i>=0; i--){
            arrr[f++] = arr[i];
        }
        return arrr;
     }

     static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


     static void reverseInPlace(int [] arr){
        int i = 0 , j = arr.length-1;

        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }

     }




    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }

    static void RotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        reverseForRotate(arr, 0, n-k-1 );
        reverseForRotate(arr, n-k, n-1);
        reverseForRotate(arr, 0, n-1);
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
//        int k = 34;
//        int l = 45;
//        swap(k,l);
        int [] arr = {1,2,3,4,5};
        printArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        RotateInPlace(arr, k);
        printArray(arr);



//        reverseInPlace(arr);
//        printArray(arr);
////        for(int i =0; i<arr_1.length; i++){
//            System.out.print(arr_1[i] + " ");
//        }
//        System.out.println(" ");



    }
}
