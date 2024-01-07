import java.util.*;
public class arrays_4_frequncy_array_manvi_maam {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for(int i =0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter the number of quesries: ");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter the number to be searched: ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;


        }




    }
}
