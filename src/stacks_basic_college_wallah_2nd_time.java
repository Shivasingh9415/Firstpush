import java.util.*;
public class stacks_basic_college_wallah_2nd_time {
    public static void displayReverserec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverserec(st);
        st.push(top);
    }



    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(45);
        st.push(56);
        st.push(41);
//        System.out.println(st.peek());
//        System.out.println(st);
//        System.out.println(st.pop());
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> sk = new Stack<>();
//        System.out.println("Enter the number of elements: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for(int i =1; i<=n; i++){
//            int x = sc.nextInt();
//            sk.push(x);
//        }
//        System.out.println(sk);
//
//        Stack<Integer> sl = new Stack<>();
//        while(sk.size() >0){
//            sl.push(sk.pop());
//        }
//
//        Stack<Integer> sp = new Stack<>();
//        while(sl.size()>0){
//            sp.push(sl.pop());
//        }
//
//        System.out.println(sp);

//      display Stack
        Stack<Integer> sn = new Stack<>();
        Stack<Integer> sm = new Stack<>();
        sm.push(3);
        sm.push(7);
        sm.push(12);
        sm.push(78);
        System.out.println(sm);
//        while(sm.size()>0){
//            int x = sm.pop();
//            sn.push(x);
//        }
//
//        while(sn.size()>0){
//            int x = sn.pop();
//            System.out.print(x + " ");
//            sm.push(x);
//        }
//        using arrays
//        System.out.println("Printing by using arrays: ");
//        int n = sm.size();
//        int[] arr = new int[n];
//        for(int i =n-1; i>=0; i--){
//            arr[i] = sm.pop();
//        }
//        for(int i =0; i<n; i++){
//            System.out.print(arr[i] + " ");
//            sm.push(arr[i]);
//        }
//

//        using recursion
        displayReverserec(sm);








    }
}
