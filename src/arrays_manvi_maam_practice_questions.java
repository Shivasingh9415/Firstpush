import java.util.*;

public class arrays_manvi_maam_practice_questions {

//
    static int uniqueValue(int [] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i =0; i<n; i++){
            if(arr[i] >0){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }




//   WAP to print the number of pairs in an array whose sum is equal to the given number.
    static int targetsum(int[] arr, int target){
        int ans =0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print("Array is: " + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter the value of target sum: ");
//        int k = sc.nextInt();

//        System.out.println(targetsum(arr, k));

        System.out.println(uniqueValue(arr));





    }
}
