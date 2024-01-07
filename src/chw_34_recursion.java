public class chw_34_recursion {

    static int factorial_iterative(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i<=n; i++){
                product = product*i;
            }
            return product;

        }
    }

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(factorial_iterative(4));

    }
}
