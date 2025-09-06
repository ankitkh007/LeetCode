import java.util.*;
public class insertion_sort 
{
    static void in_sort(int arr[],int n)
    {
        int temp=0;
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        in_sort(arr, n);
        System.out.println("The sorted elements are : ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}

// Time Complexity
// Best = O(n)
// Avg,Worst = O(n^2)