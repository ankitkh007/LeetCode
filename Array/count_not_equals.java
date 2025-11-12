import java.util.*;
public class count_not_equals
{
    static int countNotEquals(int nums[], int val)
    {
        int low=0, high=nums.length-1;
        if(nums.length==1 && nums[0]==val)
        return 0;

        while(low<=high)
        {
            if(nums[low]==val && nums[high]!=val)
            {
                int temp=nums[low]; 
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
            }
            else if(nums[low]==val && nums[high]==val)
            {
                high--;
            }
            else
            low++;
        }
        return low;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        System.out.println("Enter the value you want to remove: ");
        int val=sc.nextInt();

        System.out.println(countNotEquals(arr, val));
        sc.close();
    }
}