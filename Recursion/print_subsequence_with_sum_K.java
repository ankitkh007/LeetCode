import java.util.*;

public class print_subsequence_with_sum_K {
    static void subsequence(int idx, int n, int arr[], ArrayList<Integer> list, int s, int sum) {
        if (idx == n) {
            if (s == sum) {
                for (int i : list)
                    System.out.print(i + " ");
                System.out.println();
            }
            return;
        }
        list.add(arr[idx]); // Take
        s += arr[idx];
        subsequence(idx + 1, n, arr, list, s, sum);
        list.remove(list.size() - 1); // Not take
        s -= arr[idx];
        subsequence(idx + 1, n, arr, list, s, sum);
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

        ArrayList<Integer> list = new ArrayList<>();
        subsequence(0, n, arr, list, 0, sum);
        sc.close();
    }
}
