public class chw_33_varatgs {

    static int sum( int a, int b){
        return a+b;
    }

    static int sum (int c , int ...array){
        int result = c;
        for(int a: array){
            result = result + a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs");
        System.out.println("the sum is  " + sum (4 , 5));
        System.out.println("The sum is " + sum(1,3,4,6,8,9));
        System.out.println("The sum of nothing is " + sum(1,4,5,6));
    }
}
