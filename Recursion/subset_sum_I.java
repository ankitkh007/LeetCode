import java.util.*;

public class subset_sum_I {
    static void subsetSum1(int idx, int n, int arr[], int sum, List<Integer> ans) {
        if (idx == n) {
            ans.add(sum);
            return;
        }

        // pick the element
        subsetSum1(idx + 1, n, arr, sum + arr[idx], ans);
        // do not pick the element
        subsetSum1(idx + 1, n, arr, sum, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        List<Integer> ans = new ArrayList<>();
        subsetSum1(0, n, arr, 0, ans);
        for (int x : ans)
            System.out.print(x + " ");
        sc.close();
    }
}
