import java.util.*;
//import java.util.Arrays;
public class longest_consecutive_sequence 
{
    static int longestConsecutiveSequence(int nums[])
    {
        Arrays.sort(nums);
        int longest=1,count=0,lastSmallest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastSmallest)
            {
                count++;
                lastSmallest=nums[i];
            }
            else if(nums[i]!=lastSmallest)
            {
                count=1;
                lastSmallest=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
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

        System.out.println("The longest consecutive sequence is : " + longestConsecutiveSequence(arr));
        sc.close();
    }
}