import java.util.*;

public class palindrome_check {
    static boolean check_palin(String str, int i, int n) {
        if (i >= n / 2)
            return true;
        else if (str.charAt(i) != str.charAt(n - i - 1))
            return false;
        else
            return check_palin(str, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.next();

        if (check_palin(str.toUpperCase(), 0, str.length()))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");

        sc.close();
    }
}
