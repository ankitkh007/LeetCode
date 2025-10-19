import java.util.*;
public class peak_element
{
    static int getPeak(int nums[])
    {
        int n=nums.length;

        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        int low=1,high=n-2;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
            return mid;

            else if(nums[mid]>nums[mid-1])
            low=mid+1;

            else if(nums[mid]>nums[mid+1])
            high=mid-1;

            else
            low=mid+1;
        }
        return -1;
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

        System.out.println("The peak element in the given array is: "+getPeak(arr));
        sc.close();
    }
}