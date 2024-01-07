public class chw_35_methods_questions {

   // solution 6 -->

    static int sum (int ...array){
        int result = 0;
        for(int a: array){
            result = result +a;
        }
        return result;

    }


    // solution 5 -->

    static int fib(int n){
        if (n == 1) {
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    // solution 3 -->
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }
    }



// solution 2-->
    static void pattern(int n){
        for(int i =0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //question 1 --> Write a java method to print multiplication table of a number n..
    //solution 1 -->

    static void multiplication(int n){
        for(int i = 1; i<=10; i++ ){
            System.out.format("%d X %d = %d \n", n, i, n*i );
        }
    }



    public static void main(String[] args) {



       // ques 1--> output--> multiplication(7);

        //ques 2 --> Write a program using functions to print the following pattern:
        /* *
           * *
           * * *
           * * * *
         */
        pattern(9);

        // ques 3 --> Write a recursive function to calculate sum of first n natural numbers.

        int c = sumRec(6);
        System.out.println(c);


        // ques 4 --> Write a function to print the following pattern..
        /*    * * * *
              * * *
              * *
              *
         */

        /// ques 5 --> Write a program to print nth term of fibonacci seires using recursion..

        int d = fib(6);
        System.out.println(d);

        // ques 6 --> Write a function to find average of a set of numbers passed as arguments.

        System.out.println("The sum of numbers is " + sum(4,6,5,7,4));


        //






    }
}
