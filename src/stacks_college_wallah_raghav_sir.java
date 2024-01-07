import java.util.Stack;
public class stacks_college_wallah_raghav_sir {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(90);
        st.push(56);
        System.out.println(st.peek());
//        to print the full stack
        System.out.println(st);
//        to remove the top most element
        st.pop();
        System.out.println(st);
        System.out.println("size of stack is: " + st.size());
//        if we want to print the first element of stack
//        we can do this with the help of loop
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        

    }
}
