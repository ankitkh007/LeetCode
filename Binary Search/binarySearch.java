import java.util.*;
public class binarySearch 
{
    //usual approach
    /*static int search(int nums[],int target)
    {
        int low=0, high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(nums[mid]==target)
            return mid;
            else if(target>nums[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        return -1;
    }*/

    //recursive approach
    static int search(int nums[],int low, int high, int target)
    {
        if(low>high) return -1;

        int mid=(low + high)/2;
        if(nums[mid]==target) return mid;
        else if(target>nums[mid]) return search(nums, mid+1, high, target);
        else return search(nums, low, mid-1, target);
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

        System.out.println("Enter the number you want to search: ");
        int x=sc.nextInt();

        if(search(arr,0,arr.length-1,x)==-1)
        System.out.println("Element not found");
        else
        System.out.println("The element is found at position: "+search(arr,0,arr.length-1,x));
        sc.close();
    }    
}