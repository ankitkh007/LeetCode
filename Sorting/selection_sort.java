//package Sorting;
import java.util.*;
public class selection_sort 
{
    static void s_sort(int arr[],int n)
    {
        int min=0,j;
        for(int i=0;i<=n-2;i++)
        {
            min=i;
            for(j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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

        s_sort(arr, n);
        System.out.println("The sorted elements are : ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
