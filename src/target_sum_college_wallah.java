// wap to print the number of pairs in an array whose sum is equal to 7.
import java.util.*;
public class target_sum_college_wallah {
    static int targetsum(int[] arr, int target){
        int n = arr.length;
        int ans =0;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arrr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i<arrr.length; i++){
            arrr[i] = sc.nextInt();
        }

//        System.out.println("Your array elemets are: ");
//        for(int i=0; i<arrr.length; i++){
//            System.out.print(arrr[i]);
//        }

        System.out.println("Enter your target: ");
        int target = sc.nextInt();

        System.out.println(targetsum(arrr,target));



    }
}
