public class functions_in_java_2nd_time_code_with_harry {

    static int logic(int x,int y){
        int z ;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        int d = 56;
        int l = 45;
        int k;
        k = logic(d,a);
        System.out.println(c);
        System.out.println(k);



    }
}
