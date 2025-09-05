import java.util.*;

public class freq_count {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2};

        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            // Option 1:
            // freq.put(x, freq.getOrDefault(x, 0) + 1);

            // Option 2 (nice):
            freq.merge(x, 1, Integer::sum);
        }

        System.out.println(freq); // {2=3, 3=2, 5=1}

        // iterate entries
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println("value " + e.getKey() + " occurs " + e.getValue() + " times");
        }
    }
}
