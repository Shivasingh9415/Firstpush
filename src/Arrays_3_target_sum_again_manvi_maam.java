import java.util.*;
public class Arrays_3_target_sum_again_manvi_maam {



    static int uniqueValue(int[] arr){
        int ans = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] >0){
                ans = arr[i];
            }
        }
        return ans;
    }


    static int targetSum(int[] arr, int target){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of arrays: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Unique value in the array is " + uniqueValue(arr));

//        System.out.println("Enter the value of target: ");
//        int target = sc.nextInt();

//        System.out.println("NUmber of pairs are: "+ targetSum(arr,target));



    }
}
