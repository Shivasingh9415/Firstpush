import java.util.*;

public class arrays_apna_classes_2nd_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] number = new int[size];

        for(int i = 0; i<=size; i++){
            number[i] = sc.nextInt();
        }
        for(int i =0; i<=size; i++){
            System.out.println(number[i]);
        }


        int[] marks = new int[4];
        String subjects[] = {"Physics", "Maths", "English", "Chemistry"};
//        System.out.println();
        marks[0] = 45;
        marks[1] = 46;
        marks[2] = 50;
        marks[3] = 90;
//        System.out.println(marks[3]);
        for(int i = 0; i<=3; i++){
            if(i==2){
                continue;
            }
//            System.out.println(marks[i]);
        }
        for(int i = 0; i<=3; i++){
//            System.out.println(subjects[i]);
        }

    }
}
