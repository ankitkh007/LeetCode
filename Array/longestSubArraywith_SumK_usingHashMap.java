import java.util.*;

public class longestSubArraywith_SumK_usingHashMap 
{
    static int longest_subrray(int arr[], int k) 
    {
        int length = 0;
        int curSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        
        map.put(0, -1); 

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (map.containsKey(curSum - k)) 
            {
                // Get the starting index of the subarray
                int start = map.get(curSum - k) + 1;
                // Calculate the length and update if it's the new maximum
                length = Math.max(length, i - start + 1);
            }
            
            // Only put the current sum if it's not already in the map
            // This ensures we get the longest subarray, as we want the earliest possible start index
            if (!map.containsKey(curSum)) 
            {
                map.put(curSum, i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the sum you want : ");
        int k = sc.nextInt();

        System.out.println("The longest subarray length with sum " + k + " is : " + longest_subrray(arr, k));
        sc.close();
    }
}