import java.util.*;
public class java_sample_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number after which you want to print 5 even numbers : ");
        int n = sc.nextInt();
            for(int i=n+1; i<=n+10; i++){
                if(i%2==0){
                    System.out.println(i);
                }
        }

    }
}
