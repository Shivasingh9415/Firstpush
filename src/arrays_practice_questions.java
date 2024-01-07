import java.util.*;
public class arrays_practice_questions {

    //        A variable number of arguments can be passed to a method
    public static int sum(int... numbers){
        int sum =0;
        for(int i =0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        return sum;
    }

    public static double print(String name, double... numbers){
        double sum =0;
        for(int i=0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(print("Shiva", 67.8,45.3));





















//        filling arrays
//        String[] string = new String[4];
//        String[] name = new String[5];
//        Arrays.fill(name, 1,4,"Shiva");
//        for(int i =0; i<name.length; i++){
//            System.out.print(name[i]+ " ");
//        }
//        System.out.println(" ");
//        Arrays.fill(string, "Singh");
//        for(int i = 0; i<string.length; i++){
//            System.out.print(string[i]+ " ");
//        }
//        fill array
//        int[] numbers1 = new int[6];
//        int[] numbers2 = new int[8];
//
//
//
//        Arrays.fill(numbers2, 32);
//        for(int i = 0; i<numbers2.length; i++){
//            System.out.print(numbers2[i]+ " ");
//        }
//
//        System.out.println(" ");
//
//        Arrays.fill(numbers1, 1,5,45);
//        for(int i =0; i<numbers1.length; i++){
//            System.out.print(numbers1[i] + " ");
//        }



















//        int[] numbers1 = {0,5,4,3,1,7,-3};
//        int[] numbers2 = {0,5,4,3,1,7,-3};
//        int[] numbers3 = {0,4,4,1,1,6,-3};
////        System.out.println(numbers1 == numbers2);
//        System.out.println(Arrays.equals(numbers1, numbers2));
//        System.out.println(Arrays.equals(numbers1 , numbers3));




















//        Arrays.sort(numbers);
//        for(int i = 0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//        System.out.println("The number is present at index: ");
//        System.out.println(Arrays.binarySearch(numbers, 7));
























//        Arrays.sort(numbers, 2, 7);
//        for(int i = 0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

























//        int numbers[] = {23,45,67,89};
//        for(int i =0; i<numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
    }
}
