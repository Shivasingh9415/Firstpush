import java.util.*;
class add{
    public int sum(int a, int b ){
        int c = a+b;
        return c;
    }
    add(){
        System.out.println("constructor of add class ");
    }

}



public class methods_in_java_college_wallah {
    public static void main(String[] args) {
        add sum1 = new add();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum1.sum(a,b));




    }
}
