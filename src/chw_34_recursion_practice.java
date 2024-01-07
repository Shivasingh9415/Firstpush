public class chw_34_recursion_practice {

    static int fabonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return fabonacci((n-1)+(n-2));
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fabonacci(n));

    }
}
