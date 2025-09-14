import java.util.*;

class Solution {
    // Returns length of longest contiguous subarray with sum == k
    public int longestSubarray(int[] arr, int k) {
        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1); // prefix sum 0 occurs before array starts

        long prefix = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            // If this prefix sum hasn't been seen before, store earliest index
            firstIndex.putIfAbsent(prefix, i);

            // Check if there is a prefix that when subtracted gives k
            Long need = prefix - k;
            if (firstIndex.containsKey(need)) {
                int startIndex = firstIndex.get(need);
                maxLen = Math.max(maxLen, i - startIndex);
            }
        }
        return maxLen;
    }
}
