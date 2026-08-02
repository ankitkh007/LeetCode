import java.util.*;

public class count_subsequence_with_sum_K {
    static int subsequence(int idx, int n, int arr[], int s, int sum) {
        if (idx == n) {
            if (s == sum) {
                return 1;
            }
            return 0;
        }

        s += arr[idx]; // Take
        int l = subsequence(idx + 1, n, arr, s, sum);

        s -= arr[idx]; // Not take
        int r = subsequence(idx + 1, n, arr, s, sum);

        return l + r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the target sum: ");
        int sum = sc.nextInt();

        System.out.println(subsequence(0, n, arr, 0, sum));
        sc.close();
    }
}
