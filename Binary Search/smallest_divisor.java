import java.util.*;
public class smallest_divisor
{
    static int getMaxValue(int arr[]) //returns the maximum value from the array
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        max=Math.max(max, arr[i]);

        return max;
    }

    static int sumOfDivisor(int arr[],int d)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=Math.ceil((double)arr[i]/d); //calculates the sum of divided answers

        return sum;
    }
    static int smallestDivisor(int[] nums, int threshold)
    {
        int low=1,high=getMaxValue(nums);
        int n=nums.length;

        if(n>threshold) return -1; //impossible case

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(sumOfDivisor(nums,mid)<=threshold) //if sum of divisor is<=threshold therefore everything after that will be possible so eliminate the right half
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

        System.out.println("Enter the threshold value: ");
        int th=sc.nextInt();

        System.out.println("The smallest divisor for the guven threshold is: "+ smallestDivisor(arr, th));
        sc.close();
    }
}
