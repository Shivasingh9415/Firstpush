import java.util.*;
public class Arrays_6_prefix_sum_manvi_maam {

//    follow up question-->
//    write the code of suffix sum.

    static void reverse(int[]arr){
        int n = arr.length;
        for(int i= n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    static int[] suffixSum(int[] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int k =0;

        for(int i=n-2; i>=0; i--){
            ans[++k] = arr[i] + arr[i-1];
        }
        reverse(ans);
        return ans;
    }


//    ques--> 2
//    Given an array of integers of size n. Answer q queries where you need to print
//    the sum of values in a given range of indices from l to r(both included).
//    NOTE: The values of l and r in queries follow 1_based indexing.
//  Solution--> It is done by using prefix sum array by subsctracting the value of pref[r]-pref[l-1].


//  ques--> 3
//  Check if we can partition the array into two subarrays with equal sum.More formally, check that the prefix sum
//  of a part of the array is equal to the suffix sum of rest of the array.

    static int findSum(int[] arr){
        int totalsum = 0;
        for(int i =0; i<arr.length; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalsum = findSum(arr);
        int prefixsum = 0;

        for(int i =0 ; i<arr.length; i++){
            prefixsum += arr[i];
            int suffixsum = totalsum - prefixsum;
            if(prefixsum == suffixsum){
                return true;
            }
        }
        return false;
    }



//    ques -1--> Given an integer array "a" return the prefix sum/running sum in the same array without creating a new array.

      static int[] makePrefixSumArray(int[] arr){
//          int n = arr.length;
//          int[] pref = new int[n];
//          pref[0] = arr[0];

          for(int i=1; i<arr.length; i++){
              arr[i] = arr[i] + arr[i-1];
          }
          return arr;
      }

      static void printArray(int[] arr){
          for(int i=0 ; i<arr.length; i++){
              System.out.print(arr[i] + " ");
          }
          System.out.println(" ");
      }



    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array: ");
          int n = sc.nextInt();
          int[] arr = new int[n];

        System.out.println("Enter your elements: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);

//        System.out.println("Equal sum partition: " + equalSumPartition(arr));
//        int[] pref = makePrefixSumArray(arr);
//
//        System.out.println("Enter q queries: ");
//        int q = sc.nextInt();
//
//        while(q>0){
//            System.out.println("Enter range: ");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = pref[r] - pref[l-1];
//
//            System.out.println("sum is: " + ans);
//
//            q--;
//        }

        int[] ans = suffixSum(arr);
        printArray(ans);

//        int[] shiva = {1,2,3,4};
//        reverse(shiva);
//        printArray(shiva);
    }
}
