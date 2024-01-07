public class Array_reference_in_java_college_wallah {


    static void print_array(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void change_array(int[] arr){
        for(int i= 0; i<arr.length; i++){
            arr[i] = 0;

        }
    }
    public static void main(String[] args) {
        int[] arr_1 = new int[3];
        arr_1[0] = 1;
        arr_1[1] = 2;
        arr_1[2] = 3;

        change_array(arr_1);
        print_array(arr_1);


    }
}
