import java.util.*;
public class LongestSubarrayWithSum_optimal 
{
    static int longestSubarray(int[] arr, int k) 
    {
        /*Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1); // prefix sum 0 occurs before array starts

        long prefix = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            prefix += arr[i];

            // If this prefix sum hasn't been seen before, store earliest index
            map.putIfAbsent(prefix, i);

            // Check if there is a prefix that when subtracted gives k
            Long need = prefix - k;
            if (map.containsKey(need)) 
            {
                int startIndex = map.get(need);
                maxLen = Math.max(maxLen, i - startIndex);
            }
        }
        return maxLen;*/

        //The below method only works on positives
        int n = arr.length; // size of the array.
        int left = 0, right = 0; // 2 pointers
        int sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward the right pointer:
            right++;
            if (right < n) 
            sum += arr[right];
        }

        return maxLen;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the sum you want : ");
        int k = sc.nextInt();

        System.out.println("The longest subarray length with sum " + k + " is : " + longestSubarray(arr, k));
        sc.close();
    }
}
