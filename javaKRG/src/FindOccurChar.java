import java.util.*;
public class FindOccurChar {
    public static void main(String[] args) {
        String str1 = "ABCABCANACNANNCA";
        int i = str1.length();
        str1 = str1.replace("N", "AA");
        int j = str1.length();
        System.out.println(j - i);
    }
}
