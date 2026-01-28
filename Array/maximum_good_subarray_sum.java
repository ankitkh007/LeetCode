import java.util.*;

class maximum_good_subarray_sum {
    /*
     * static long maxgoodSubarraySum(int nums[], int k) {
     * long sum = 0L, max_sum = Long.MIN_VALUE;
     * 
     * for (int i = 0; i < nums.length; i++) {
     * List<Long> list = new ArrayList<>();
     * for (int j = i; j < nums.length; j++) {
     * list.add((long) nums[j]);
     * if (Math.abs(nums[j] - nums[i]) == k) { // if the differemce b/w 1st & last
     * element of subarray equals k
     * sum = getSubbaraySum(list);// then find the max subarray sum of the subarray
     * max_sum = Math.max(max_sum, sum);
     * } // stores the maximum sum of all possible subarrays
     * }
     * }
     * if (max_sum == Long.MIN_VALUE)
     * return 0;
     * else
     * return max_sum;
     * 
     * }
     * 
     * static long getSubbaraySum(List<Long> list) {
     * long sum = 0L;
     * for (long x : list) {
     * sum += x;
     * }
     * return sum;
     * }
     */

    // Next using HashMap
    static long maxgoodSubarraySum(int nums[], int k) {
        HashMap<Long, Long> map = new HashMap<>();
        long cursum = 0l, max_sum = Long.MIN_VALUE, required1, required2;

        for (int i = 0; i < nums.length; i++) {
            cursum += (long) nums[i];

            required1 = (long) (nums[i] - k);
            required2 = (long) (nums[i] + k);

            if (map.containsKey(required1))
                max_sum = Math.max(max_sum, cursum - map.get(required1) + required1);
            if (map.containsKey(required2))
                max_sum = Math.max(max_sum, cursum - map.get(required2) + required2);

            map.put((long) nums[i], Math.min(map.getOrDefault((long) nums[i], Long.MAX_VALUE), cursum));
        }
        if (max_sum != Long.MIN_VALUE)
            return max_sum;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the target difference(k) between 1st & last element of subarray: ");
        int k = sc.nextInt();

        System.out.println("The maximum subarray sum is : " + maxgoodSubarraySum(arr, k));
        sc.close();
    }
}