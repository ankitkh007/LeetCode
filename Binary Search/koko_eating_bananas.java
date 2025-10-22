import java.util.*;
public class koko_eating_bananas
{
    static int getMaxValue(int arr[]) //returns the maximum value from the array
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        max=Math.max(max, arr[i]);

        return max;
    }

    static int getTotalHours(int arr[], int hourly) //calculates the total hours needed for koko 
    {                                               //to finish the entire banana piles for individual hourly rate(bananas/hr)
        int totalhrs=0;
        for(int i=0;i<arr.length;i++)
        totalhrs+=Math.ceil((double)arr[i]/(double)hourly);

        return totalhrs;
    }

    static int minEatingSpeed(int piles[], int h)
    {
        int low=1,high=getMaxValue(piles);

        while(low<=high)
        {
            int mid=(low+high)/2;

            int totalhours=getTotalHours(piles, mid);

            if(totalhours<=h) //if total hours required is in the given range then simply check for lower hourly rates 
            high=mid-1;
            else
            low=mid+1;
        }

        return low;
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

        System.out.println("Enter the maximum hours koko has: ");
        int h=sc.nextInt();

        System.out.println("The minimum eating speed for Koko is: "+ minEatingSpeed(arr,h));
        sc.close();
    }
}
