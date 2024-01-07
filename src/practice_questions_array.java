import java.util.*;

public class practice_questions_array {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,-3,-4,8};

        int[] temp = new int[numbers.length];
        int j = 0;
        int k = numbers.length-1;

        for(int i = 0; i<numbers.length; i++ ){
            if(numbers[i] % 2 !=0) {
                temp[j++] = numbers[i];
            }
            else{
                temp[k--] = numbers[i];
            }
        }
        copyArray(temp, numbers);
        System.out.println(Arrays.toString(numbers));
    }
    private static void copyArray(int[] temp, int[] numbers){
        for(int i = 0; i<temp.length; i++){
            numbers[i] = temp[i];
        }
    }
    }
////        Write a program that display the maximum and minimum elements of an array.
//        int[] numbers = {-2,3,4,5,67,89,0};
//        int min = numbers[0];
//        int max = numbers[0];
//
//        for(int i=0; i<numbers.length; i++){
//            if(numbers[i] > max){
//                max = numbers[i];
//            }
//            if(numbers[i]<min){
//                min = numbers[i];
//            }
//        }
//        System.out.println("max = "+max + " min = "+ min);
//
//
//
//
//
//    }
//}
//
//
//















//        Write a program that displays the sum,product,and average of the elements of an integer array.
//        int sum = 0;
//        int product = 1;
//        double average;
//        int numbers[] = {23,45,3,1,6};
//        for(int i=0; i<numbers.length; i++){
//            sum = sum+numbers[i];
//            product = product*numbers[i];
//        }
//        average = (double)sum/numbers.length;
//        System.out.println("The sum of numbers is: "+ sum);
//        System.out.println("The product of numbers is: "+ product);
//        System.out.println("The average of numebrs is: "+ average);
















// Question1 --> Take n input from the user and create an array list.


//        int size = sc.nextInt();;
//        int name[] = new int[size];
//        for(int i=0; i<name.length; i++){
//            name[i] = sc.nextInt();
//        }
//
//        for(int i =0; i<name.length; i++){
//            System.out.println(name[i]);
//        }
//        System.out.println(name[3]);


//    }
//}
