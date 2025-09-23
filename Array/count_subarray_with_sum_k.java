import java.util.*;
public class count_subarray_with_sum_k 
{
    //brute solution
    /*static int countSubarray(int arr[],int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {   int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                count++;
            }
        }
        return count;
    }*/

    //optimal solution
    static int countSubarray(int arr[],int k)
    {
        int prefix=0;
        int count=0;
        Map<Integer, Integer> mpp=new HashMap<>();
        mpp.put(0,1); //prefix 0 seen once
        for(int i=0;i<arr.length;i++)
        {
            prefix+=arr[i];
            count+=mpp.getOrDefault(prefix-k, 0); //if (prefix-k) already exists; update count+=no. of times (prefix-k) exists
            mpp.put(prefix, mpp.getOrDefault(prefix, 0)+1); // add curent prefix-sum and update its frequency
        }

        return count;
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

        System.out.println("Enter the sum you want : ");
        int k=sc.nextInt();

        System.out.println("Total subarrays length with sum "+ k +" is : "+ countSubarray(arr, k));
        sc.close();     
    }          
}

//TC-->O(n)
//SC-->O(n)