import java.util.*;
public class maximum_subarray_product
{
    static long maxSubarrayProduct(int nums[])
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=i;j<nums.length;j++)
            {
                product*=nums[j];
                max=Math.max(product,max);
            }
        }
        return max;
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

        System.out.println("The maximum subarray product is : "+ maxSubarrayProduct(arr));
        sc.close();     
    }      
}