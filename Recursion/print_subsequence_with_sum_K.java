import java.util.*;

public class print_subsequence_with_sum_K {
    static boolean subsequence(int idx, int n, int arr[], ArrayList<Integer> list, int s, int sum) {
        if (idx == n) {
            if (s == sum) {
                for (int i : list)
                    System.out.print(i + " ");
                System.out.println();
                return true; // when only want to print single answer
            }
            return false;
        }
        list.add(arr[idx]); // Take
        s += arr[idx];
        if (subsequence(idx + 1, n, arr, list, s, sum))
            return true; // if this gives the answer return true no need to check further
        ;
        list.remove(list.size() - 1); // Not take
        s -= arr[idx];
        if (subsequence(idx + 1, n, arr, list, s, sum)) // same for this
            return true;

        return false; // otherwise return false
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
