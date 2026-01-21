import java.util.*;

public class rearrange_array_by_sign_gfg {
    static void sortedarray(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int x : arr) {
            if (x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }
        int min_limit = Math.min(pos.size(), neg.size()); // getting smaller length of the two
        int p = 0, n = 0, i;
        for (i = 0; i < (min_limit * 2); i++) // All possible pairs are stored
        {
            if (i % 2 == 0) {
                arr.set(i, pos.get(p++));
            } else {
                arr.set(i, neg.get(n++));
            }
        }

        if (pos.size() > neg.size()) {
            for (int j = min_limit; j < pos.size(); j++) {
                arr.set(i++, pos.get(p++));
            }
        } else {
            for (int j = min_limit; j < neg.size(); j++) {
                arr.set(i++, neg.get(n++));
            }
        }
        System.out.println("The rearranged array is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
            arr.add(sc.nextInt());
        sortedarray(arr);
        sc.close();
    }
}

// Variety 1
// TC--> O(n)
// SC--> O(n)

// Variety 2
// TC--> O(2n)
// Sc--> O(n)