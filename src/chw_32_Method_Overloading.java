public class chw_32_Method_Overloading {

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a , int b, int c){
        System.out.println(a + "good morning bro! " + b + " " + c);
    }

    static void foo(int a)
    {
        System.out.println(a + "Good Morning bro!");
    }

    static void change(int [] marks)
    {
        marks[0] = 45;
    }

    static void telljoke()
    {
        System.out.println("good morning bro");

    }
    public static void main(String[] args) {
        telljoke();

        int [] aray = {23, 45, 65, 76};
        change(aray);
        //System.out.println("The value of x is: " + aray[0] );

        foo();
        foo(500);
        foo(500,700,06);


    }
}
