public class arrays_2nd_time_manvi_maam {

    static int add(int a, int b){
        return(a+b);
    }


    public static void main(String[] args) {
        int[] arr = {1,5,3};
        int target =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > target){
                target = arr[i];
            }
        }
        System.out.println(target);
//        int sum =0;
//        for(int i=0; i<arr.length; i++){
//            sum = sum+arr[i];
//        }
//        System.out.println("sum is: " + sum);





    }
}
