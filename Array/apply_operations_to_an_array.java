import java.util.*;
public class apply_operations_to_an_array
{
    static void move(int nums[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]+nums[i+1];
                nums[i+1]=0;
            }
            
        }

        int j=0;
        for(int i=0;i<n;i++)
        {
            if (nums[i]!=0)
                nums[j++]=nums[i];
        }
        for(int i=j;i<n;i++)
            nums[i]=0;
        System.out.println("The array after moving all zeroes to end is : ");
        for (int i=0;i<n;i++)
        System.out.print(nums[i] + " ");
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
        
        move(arr, n);
        sc.close();    
    }    
}