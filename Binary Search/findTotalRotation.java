import java.util.*;
public class findTotalRotation
{
    static int findRotations(int nums[])
    {
        int low=0,high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        int rotations=0;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[low]<=nums[mid]) //if left half is sorted
            {
                if(nums[low]<=ans)
                {
                    ans=nums[low];
                    rotations=low;
                }
                low=mid+1;
            }
            else //if right half is sorted
            {
                if(nums[mid]<=ans)
                {
                    ans=nums[mid];
                    rotations=mid;
                }
                low=mid+1;
                high=mid-1;
            }
        }
        return rotations;
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

        System.out.println("The number of times the array  has been roatated is: "+findRotations(arr));
        sc.close();
    }    
}