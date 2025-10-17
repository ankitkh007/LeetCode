import java.util.*;
public class searchinRotatedArray_1
{
    static int searchInRotatedArray(int nums[], int target)
    {
        int n=nums.length;
        int low=0,high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            return mid;

            //if left half is sorted
            else if(nums[low]<=nums[mid])
            {
                if(target>=nums[low] && target<=nums[mid])
                high=mid-1;
                else
                low=mid+1;
            }

            //if right half is sorted
            else
            {
                if(target>=nums[mid] && target<=nums[high])
                low=mid+1;
                else
                high=mid-1;
            }
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

        System.out.println("Enter the number you want to search: ");
        int x=sc.nextInt();

        System.out.println(searchInRotatedArray(arr, x));
        sc.close();
    }
}