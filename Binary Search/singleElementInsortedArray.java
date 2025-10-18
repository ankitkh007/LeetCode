import java.util.*;
public class singleElementInsortedArray
{
    static int findSingle(int nums[])
    {
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]!=nums[i] && nums[i+1]!=nums[i])
            return nums[i];
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

        System.out.println("The single element in the array is: "+findSingle(arr));
        sc.close();
    }
}