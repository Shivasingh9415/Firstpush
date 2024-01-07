import java.util.*;
public class Advance_programming_work_1 {


//   wap to find q queries present in the array or not by frequency array
    static int[] frequencyArray(int[] arr){
        int[] freq = new int[100005];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverseIJ(int [] arr, int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int arr[], int k){
        int n = arr.length;
        k = k%n;
        reverseIJ(arr, 0,n-k-1);
        reverseIJ(arr, n-k,n-1);
        reverseIJ(arr,0,n-1);
    }


//    rotate an array by k steps:
    static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j =0;

        for(int i =n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

//    static int[] reverse(int[]arr){
//        int n = arr.length;
//        int ans[] = new int[n];
//        int j =0;
//
//        for(int i=n-1; i>=0; i--){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
//        rotateInPlace(arr,k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int freq[] = frequencyArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of quesries you want to ask: ");
        int q =  sc.nextInt();

        while(q>0){
            System.out.println("Enter the number to be searched: ");
            int x = sc.nextInt();
            if(freq[x] >0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }

//        int sum =0;
//        for(int i=0; i<arr.length; i++){
//            sum = sum+arr[i];
//        }
//        System.out.println("Sum of elements is: "+ sum);
    }
}
