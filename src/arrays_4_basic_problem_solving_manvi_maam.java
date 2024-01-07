import java.util.*;
public class arrays_4_basic_problem_solving_manvi_maam {

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swap: " + a);
        System.out.println("Value of b after swap: " + b);
    }

    static void swapWithoutTemp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Value of a after swap: " + a);
        System.out.println("Value of b after swap: " + b);

    }
//    reverse array from k steps
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j =0;

        for(int i =n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }






//    reverse array without making new array

    static void swapInPlace(int[] arr, int i, int j ){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    static void reverseArray(int[] arr){
        int i= 0;
        int j = arr.length-1;
        while (i<j){
            swapInPlace(arr, i,j);
            i++;
            j--;
        }
    }



    static int[] reverse2(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j =0;

        for(int i = n-1; i>=0; i--){
            ans[j++] = arr[i];

        }
        return ans;
    }

    static int[] reverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-1; i>=0; i--){
            ans[j++] = arr[i];

        }
        return ans;
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }



    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int[] arr = {1,2,3,4,5};
//        int[] ans = reverse(arr);
//        for(int i=0; i<arr.length; i++){
//            System.out.print(ans[i] + " ");
//        }
//        System.out.println(" ");

        int[] arr_2 = {1,2,3,4,5,6,7};
//        int ans1[] = reverse2(arr_2);
//        for(int i=0; i<arr_2.length; i++){
//            System.out.print(ans1[i] + " ");
//        }
//        swapWithoutTemp(a,b);
//        System.out.println(reverse(arr));
        for(int i=0; i<arr_2.length; i++){
            System.out.print(arr_2[i] + " ");
        }
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k to rotate: ");
        int k = sc.nextInt();
        int ans[] = rotate(arr_2 , k);
        printArray(ans);



    }
}
