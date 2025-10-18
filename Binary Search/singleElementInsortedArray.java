import java.util.*;
public class singleElementInsortedArray
{
    //brute approach
    /*static int findSingle(int nums[])
    {
        if(nums.length==1)
        return nums[0];

        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]!=nums[i] && nums[i+1]!=nums[i])
            return nums[i];
        }

        return -1;
    }*/

    //optimal approach using Binary search
    static int findSingle(int nums[])
    {
        int n=nums.length;
        if(n==1) //if only single element is present return the same element
        return nums[0];

        if(nums[0]!=nums[1]) //check for first element
        return nums[0]; 

        if(nums[n-1]!=nums[n-2]) //check for last element
        return nums[n-1];

        int low=0,high=n-2; //check for rest of the search space ie from 2nd element to 2nd last element
        
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            return nums[mid];

            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])) //this will ensure that we are in the left half
            low=mid+1;                                                                       //therefore our element is in the right half so eliminate entire left half

            else //and if we are in the right half --> eliminate right half Since element will be in the left half
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

        System.out.println("The single element in the array is: "+findSingle(arr));
        sc.close();
    }
}