import java.util.*;
public class find_Kth_Missing_Number
{
    static int findKthPositive(int[] arr, int k) 
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k) k++;
            else
            break;
        }
        return k;
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

        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();

        System.out.println("The kth missing number is: "+ findKthPositive(arr, k));
        sc.close();
    }
}