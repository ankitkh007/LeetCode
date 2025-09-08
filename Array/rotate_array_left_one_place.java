import java.util.*;
public class rotate_array_left_one_place 
{
    static void rotate_left(int arr[],int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
           arr[i-1]=arr[i]; 
        }
        arr[n-1]=temp;

        System.out.println("The array after rotating left by one place is : ");
        for (int i=0;i<n;i++)
        System.out.print(arr[i] + " ");

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i]=sc.nextInt();
        
        rotate_left(arr, n);
        sc.close();
    }
}