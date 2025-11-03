//exactly same as book_allocation
import java.util.*;
public class painters_partition
{
    static int getMaxValue(int arr[]) //returns the maximum value from the array
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        max=Math.max(max, arr[i]);

        return max;
    }

    static int sumall(int arr[]) //calculates the sum of all the lements in the array
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];

        return sum;
    }

    //fuction to check whether can we place all the cows with our preffered distance or not
    static int PaintersCount(int arr[], int painterslimit)
    {
        int countPainters=1, lastWall=0;

        for(int i=0;i<arr.length;i++)
        {
            if(lastWall+arr[i]<=painterslimit) //if painters-Count is within the limit just sum up the next wall
            lastWall+=arr[i];

            else //else increase the painters count and set the current wall to the lastWall variable 
            {
                countPainters++;
                lastWall=arr[i];
            }
        }
        return countPainters;
    }

    //BS approach
    static int PaintersPartition(int arr[], int painters)
    {
        if(painters>arr.length) return -1;

        int low=getMaxValue(arr),high=sumall(arr); //range=(max(arr)-->sum(arr))
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(PaintersCount(arr,mid)<=painters) //if PaintersCount<=painters that means we need to reduce our painters limit provided so as to accommodate every painter
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

        System.out.println("Enter no. of painters: ");
        int pt=sc.nextInt();

        System.out.println("The minimum days required after all allocations is: "+ PaintersPartition(arr, pt));
        sc.close();
    }
}