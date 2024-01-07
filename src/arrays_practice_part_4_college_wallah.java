import java.util.*;
public class arrays_practice_part_4_college_wallah {

    static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int secondSmallest(int[] arr){
        int min = smallest(arr);

        for(int i =0; i<arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int secondmin = secondSmallest(arr);
        return secondmin;



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int[] arrr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i =0; i<arrr.length; i++){
            arrr[i] = sc.nextInt();
        }

        System.out.println(secondSmallest(arrr));

    }
}
