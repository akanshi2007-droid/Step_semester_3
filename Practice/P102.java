package feature_session_10.Practice;

import java.util.*;

public class P102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(rev + (s.equalsIgnoreCase(rev)
                ? " - palindrome" : " - not a palindrome"));
        sc.close();
    }
}