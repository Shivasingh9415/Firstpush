import java.util.Arrays;
import java.util.Scanner;
public class Arrays_2_again_in_java_manvi_maam {

     static boolean isSorted(int[] arr){
         boolean check = true;
         for(int i =1; i<arr.length; i++){
             if(arr[i] < arr[i-1]) {
                 check = false;
                 break;
             }
         }
         return check;
     }


    static int greaterThanX(int[] arr, int x){
        int number = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > x){
                number++;
            }
        }
        return number;
    }

    static int lastOccurence(int[] arr, int x){
        int lastindex = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x){
                lastindex = i;
            }
        }
        return lastindex;
    }

    static int countOfOccurences(int[] arr, int x){
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        System.out.println("Sorted or not: "+ isSorted(arr));


//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the value of x to find number of elements greater then it: ");
//        int x = sc.nextInt();
//
//        System.out.println("number of elements greater then x are: " + greaterThanX(arr, x));

//        System.out.println("LAs occurence is " + lastOccurence(arr,x));

//        System.out.println("Count of " + x + " is "+ countOfOccurences(arr, x));
////        printArray(arr);


//        int [] arr_2 = arr; --> It is shallow copy. No new space is assigned to the array
//        int[] arr_2 = arr.clone(); /*It is deep copy new space is assigned in this case */
//        int[] arr_2 = Arrays.copyOfRange(arr, 1,3);
//        int[] arr_2 = Arrays.copyOf(arr, arr.length);
//
//        System.out.println("Original Array is: ");
//        printArray(arr);
//
//        System.out.println("Copied Array is: ");
//        printArray(arr_2);
//
//        arr_2[0] = 5;
//
//        System.out.println("Original Array is: ");
//        printArray(arr);
//
//        System.out.println("Copied Array is: ");
//        printArray(arr_2);




    }
}
