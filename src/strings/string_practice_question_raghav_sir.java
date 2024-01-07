package strings;
import java.util.*;
public class string_practice_question_raghav_sir {
    public static void main(String[] args) {
        String str = "My name is Shivendra Singh ";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!= ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans = ans + sb;
                ans = ans + " ";
                sb.delete(0,sb.length());// or sb = new StringBUilder("");
            }
        }
        System.out.println(ans);

    }

}
