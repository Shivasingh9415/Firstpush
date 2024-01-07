import java.util.*;
public class array_manipulation_college_wallah {

    static int repeatingarray(int[] arr){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                    break;
                }
            }
        }
        return ans;
    }


















//    find second largest element in the array logic code.

    //    static int findMax(int[] arr){
//        int mx = Integer.MIN_VALUE;
//        for(int i =0; i<arr.length; i++){
//            if(arr[i] > mx){
//                mx = arr[i];
//            }
//        }
//        return mx;
//    }
//    static int findSecondMax(int[] arr){
//        int mx = findMax(arr);
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == mx){
//                arr[i] = Integer.MIN_VALUE;
//            }
//        }
//        int secondmax = findMax(arr);
//
//        return secondmax;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arrr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i<arrr.length; i++){
            arrr[i] = sc.nextInt();
        }
        System.out.println(repeatingarray(arrr));


//        System.out.println(" repeating array is: " +repeatingarray(arrr));


//        System.out.println("Your array elemets are: ");
//        for(int i=0; i<arrr.length; i++){
//            System.out.print(arrr[i]);
//        }

//        System.out.println("Enter your target: ");
//        int target = sc.nextInt();

//        System.out.println(findSecondMax(arrr));


    }
}
