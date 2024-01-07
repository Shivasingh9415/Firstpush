package strings;
import java.util.*;
public class toggle_string_one_shot {
    public static void main(String[] args) {
        String str = "abab";
        int i =0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome ");
                break;
            }
            else{
                System.out.println("Palindrome ");
            }
            i++;
            j--;
        }
    }
}
