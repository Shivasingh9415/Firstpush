package recursion;

public class recursion_concept {
    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
//        System.out.println(n);
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 7;
        printIncreasing(n);

    }
}
