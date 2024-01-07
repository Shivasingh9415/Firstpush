import java.util.*;
public class Two_pointers_advance_array_questions_manvi_maam_college_wallah {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZANDO(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left] ==1 && arr[right] == 0){
                swap(arr , left , right);
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




//    static void sortZeroesAndOnes(int[] arr){
//        int n = arr.length;
//        int zeroes = 0;
//        for(int i =0; i<n;i++){
//            if(arr[i] == 0){
//                zeroes++;
//            }
//        }
//        for(int i =0; i<n; i++){
//            if(i  <zeroes ){
//                arr[i] = 0;
//            }
//            else{
//                arr[i] =1;
//            }
//        }
//    }
//



    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(" Enter all the elements: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

//
//     sortZeroesAndOnes(arr);

        sortZANDO(arr);
        printArray(arr);


    }
}
