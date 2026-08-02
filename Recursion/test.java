import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ending number(max 1 crore): ");
        Long n = sc.nextLong();

        for (long i = 1; i <= n; i++)
            System.out.print(i + " ");

        sc.close();
    }
}
