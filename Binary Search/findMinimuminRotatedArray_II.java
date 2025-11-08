import java.util.*;
public class findMinimuminRotatedArray_II
{
    static int findMinII(int nums[])
    {
        int low=0, high=nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]<nums[high]) //that means right half is sorted & minimum is on the left side
            high=mid;

            else if(nums[mid]>nums[high]) //that means left half is soted, minimum is on the right side
            low=mid+1;

            else // when both are equal(duplicates) just shrink the boundary
            high--;
        }
        return nums[low];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        System.out.println("The minimum element in the array is: "+findMinII(arr));
        sc.close();
    }
}