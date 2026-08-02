import java.util.*;

public class factorial_recursion {
    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("The factorial of first " + n + " natural numbers is: " + fact(n));
        sc.close();
    }
}
