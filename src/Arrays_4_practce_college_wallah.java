import java.util.*;
public class Arrays_4_practce_college_wallah {


//    static int[] reverse(int[] arr){
//   /



//        int n = arr.length;
//        for(int i = n-1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }


//        System.out.println("Original values before swap:");
//        System.out.println("a " + a);
//        System.out.println("b " + b);
//
//        a = a+b;
//        b = a-b;
//        a = a-b;
//
//
//
//        System.out.println("Values after swap: ");
//        System.out.println("a " + a);
//        System.out.println("b " + b);
//   for q queries, check if the given number is present in the array or not.

    static int[]  makeFrequencyArray(int[] arr){
        int[] freq = new int[100004];

        for(int i =0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements int the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Given array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter the number of queries you want to ask: ");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter the number to be searched: ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes element is present");
            }
            else{
                System.out.println("No element is not present");
            }
            q--;
        }




















//        int [] arr = {1,2,3,4,5,6,7,8};
//        int[] ans = reverse(arr);
//        printArray(ans);
//


//        int a = 6;
//        int b = 8;
//        swapwithouttemp(a,b);

    }
}
