import java.util.*;
public class upper_bound 
{
    static int getUpperBound(int nums[],int target)
    {
        int low=0,high=nums.length-1;
        int ans=nums.length;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
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

        System.out.println("Enter the number you want to search: ");
        int x=sc.nextInt();

        System.out.println("The lower bound for "+x+" is: "+getUpperBound(arr,x));
        sc.close();
    }    
}