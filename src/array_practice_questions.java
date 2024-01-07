import java.util.*;

public class array_practice_questions {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your array: ");
//        int size = sc.nextInt();
//        int number[] = new int[size];
//        for(int i=0; i<size; i++){
//            number[i] = sc.nextInt();
//        }
//        int x = sc.nextInt();
//
//        for(int i = 0; i<number.length; i++){
//            if(number[i] == x){
//                System.out.println("Array found at index: " + i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i = 0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();

            for(int i =0; i<number.length; i++){
                if(number[i] == x ){
                    System.out.println(i);
                }
//                System.out.println("Total number of arrays present "+i +" is "+ number[i]);
            }
        }




    }

