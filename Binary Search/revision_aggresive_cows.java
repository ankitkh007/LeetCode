import java.util.*;
public class revision_aggresive_cows
{
    static boolean CanWePlace(int arr[], int dist, int cows)
    {
        int countCows=1, lastCow=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-lastCow>=dist)
            {
                countCows++;
                lastCow=arr[i];
            }
            if(countCows>=cows)
            return true;
        }
        return false;
    }
    static int aggresiveCows(int nums[], int cows)
    {
        Arrays.sort(nums);
        int n=nums.length;
        int low=1, high= nums[n-1]-nums[0];

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(CanWePlace(nums, mid, cows))
            low=mid+1;
            else
            high=mid-1;
        }
        return high;
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

        System.out.println("Enter no. of cows: ");
        int cows=sc.nextInt();

        System.out.println("The maximum distance among all minimums is: "+ aggresiveCows(arr, cows));
        sc.close();
    }
}