import java.util.*;
public class longestSubArraywith_SUM_K 
{
    static int longest_subrray(int arr[],int k)
    {
        int length=0;
        for(int i=0;i<arr.length;i++)
        {   int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                length=Math.max(length, j-i+1);
            }
        }
        return length;
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

        System.out.println("The longest subarray length with sum "+ k +" is : "+ longest_subrray(arr, k));
        sc.close();     
    }      
}