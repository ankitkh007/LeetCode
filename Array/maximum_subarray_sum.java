import java.util.*;
public class maximum_subarray_sum
{
    static long maxSubarraySum(int arr[])
    {
        /*int max=0;
        for(int i=0;i<arr.length;i++)
        {   int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                max=Math.max(sum,max);
            }
        }
        return max;*/

        //Kadane's Algorithm
        long sum=0L;
        long max=Long.MIN_VALUE;
        int start=-1,end=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(sum==0)
            start=i; //gives starting position of subarray with max sum
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
                end=i; //gives ending position of subarray with max sum
            }
            if(sum<0)
            sum=0;
        }
        //if(max<0) //If Not considering the negative sum
        //return 0;
        //else
        return max;


        //One more approach (Leetcode Solutions)
        /*int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0)
            sum=0;
        }
        return max;*/
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i]=sc.nextInt();

        System.out.println("The maximum subarray sum is : "+ maxSubarraySum(arr));
        sc.close();     
    }      
}

//For normal approach: TC-->O(n^2)
//For Kadane's algorithm: TC-->O(n)