import java.util.*;

public class Q1 {
    static boolean ispalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();// malayalam is my mother toungue
        String temp = new String(), result = new String();
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) != ' ') {
                temp = temp + N.charAt(i);
            }
            if (N.charAt(i) == ' ' || i == N.length() - 1) {
                if (!ispalindrome(temp)) {
                    result = result + temp + ' ';
                }
                temp = "";
            }

        }
        System.out.println(result);
    }
}
