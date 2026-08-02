import java.util.*;

public class print_subsequences {
    static void subsequence(int idx, int n, int arr[], ArrayList<Integer> list) {
        if (idx == n) {
            for (int i : list)
                System.out.print(i + " ");
            if (list.size() == 0)
                System.out.print("[]");
            System.out.println();
            return;
        }
        list.add(arr[idx]); // Take
        subsequence(idx + 1, n, arr, list);
        list.remove(list.size() - 1); // Not take
        subsequence(idx + 1, n, arr, list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        subsequence(0, n, arr, list);
        sc.close();
    }
}
