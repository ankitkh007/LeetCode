import java.util.*;
public class Two_Sum_II
{
    //two pointer approach
    /*static int[] twoSum(int numbers[], int target)
    {
        int left=0, right=numbers.length-1;

        while(left<=right)
        {
            if(numbers[left]+numbers[right]==target)
            return new int[]{left+1,right+1};

            else if(numbers[left]+numbers[right]<target)
            left++;

            else
            right--;
        }
        return new int[]{-1,-1};
    }*/

    //Binary Search approach
    static int[] twoSum(int numbers[], int target)
    {
        int n=numbers.length;
        for(int i=0;i<n;i++)
        {
            int needed=target-numbers[i];
            int idx=binarySearch(numbers, i+1, n-1, needed);
            if(idx!=-1)
            return new int[] {i+1, idx+1};
        }
        return new int[] {-1, -1};
    }

    static int binarySearch(int arr[], int low, int high, int target)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]<target)
            low=mid+1;
            else
            high=mid-1;
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

        System.out.println("Enter the target you ar looking for: ");
        int x=sc.nextInt();

        System.out.println("The indexes which sums up to give the target is: "+ Arrays.toString(twoSum(arr, x)));
        sc.close();
    }
}