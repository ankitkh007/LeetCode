import java.util.*;
public class nextPermutation
{
    static int[] next_Permutaion(int nums[])
    {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) //checking the first lesser number from the end to get the pivot
        i--;

        if(i>=0) // if found
        {
            int j=nums.length-1;
            while(j>i && nums[j]<=nums[i]) //searching for the just larger number than pivot
            j--;

            swap(nums,i,j); // swapping pivot and just larger number
        }
        reverse(nums,i+1,nums.length-1); // reversing the rest to get the sorted aray

        return nums;
    }

    static void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    static void reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
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

        System.out.println("The next permutaion is : "+ Arrays.toString(next_Permutaion(arr)));
        sc.close();     
    }      
}
