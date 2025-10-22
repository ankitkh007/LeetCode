import java.util.*;
public class minDaystoMake_M_Bouquets
{
    static boolean ispossible(int arr[], int day, int m, int k)
    {
        int count=0;
        int bouquetCount=0;
        for(int i=0;i<arr.length;i++) //checks how much flower will bloom on our choosen day
        {
            if(arr[i]<=day)
            count++;
            else
            {
                bouquetCount+=(count/k); //calculates total bouquets
                count=0;
            }
        }
        bouquetCount+=(count/k);

        return bouquetCount>=m; //return true if total bouquets>=required bouquets else return false
    }
    
    static int minDays(int[] bloomDay, int m, int k)
    {
        int n=bloomDay.length;
        if((long)m*k>n) return -1; //impossible case

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min, bloomDay[i]);
            max=Math.max(max, bloomDay[i]);
        }

        int low=min,high=max;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(ispossible(bloomDay,mid,m,k))
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

        System.out.println("Enter the number of bouquets you need: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of adjacent flowers you require: ");
        int k=sc.nextInt();

        System.out.println("The minimum eating speed for Koko is: "+ minDays(arr, m, k));
        sc.close();
    }
}
