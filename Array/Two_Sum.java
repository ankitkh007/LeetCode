import java.util.*;
public class Two_Sum 
{
    static int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            //int n=nums[i];
            int moreRequired=target-nums[i];
            if(mpp.containsKey(moreRequired))
            return new int[]{mpp.get(moreRequired),i};

            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
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

        System.out.println("The indexes having target sum is " + Arrays.toString(twoSum(arr, k)));
        sc.close();
    }
}