import java.util.*;
public class findMinimuminRotatedArray 
{
    static int findMin(int nums[])
    {
        int low=0,high=nums.length-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high) //Only works when there is no duplicate
        {
            int mid=(low+high)/2;

            if(nums[low]<=nums[mid])
            {
                ans=Math.min(ans, nums[low]);
                low=mid+1;
            }
            else
            {
                ans=Math.min(ans, nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        System.out.println("The minimum element in the array is: "+findMin(arr));
        sc.close();
    }    
}