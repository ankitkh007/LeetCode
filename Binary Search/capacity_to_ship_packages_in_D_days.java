import java.util.*;
public class capacity_to_ship_packages_in_D_days
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

    static int TotalDaysRequired(int arr[], int cap)
    {
        int days=1,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            // sum+=arr[i]; //isme ye garbar tha ki jab hi humara load ka sum capacity ko exceed kar raha humne sum ko 0 se reset kar diya
            // if(sum>cap)  //isse current load toh add hi nhi hua nad next iteration se new load add hona start ho gyee...!!
            // {
            //     days+=1;
            //     sum=0;
            // }

            if(sum+arr[i]>cap)
            {
                days+=1;
                sum=arr[i];
            }
            else
            sum+=arr[i];
        }

        return days;
    }
    static int shipWithinDays(int[] weights, int days)
    {
        int low=getMaxValue(weights), high=sumall(weights);

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(TotalDaysRequired(weights, mid)<=days) //if total calculated days for any capacity is<=provided deadline
            high=mid-1;                               //therefore everything after that will be possible so eliminate the right half
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

        System.out.println("Enter the maximum days for shipping: ");
        int days=sc.nextInt();

        System.out.println("The least weight capacity of the ship will be: "+ shipWithinDays(arr, days));
        sc.close();
    }
}
