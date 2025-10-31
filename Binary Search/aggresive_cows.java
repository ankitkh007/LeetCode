import java.util.*;
public class aggresive_cows
{
    //fuction to check whether can we place all the cows with our preffered distance or not
    static boolean canWePlaceCows(int arr[], int dist, int cows)
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
    //BS approach
    static int aggresiveCows(int arr[], int cows)
    {
        Arrays.sort(arr);
        int n=arr.length;
        int low=0,high=arr[n-1]-arr[0]; //high=max-min

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(canWePlaceCows(arr,mid,cows))
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