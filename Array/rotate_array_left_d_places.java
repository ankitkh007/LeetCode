import java.util.Scanner;

public class rotate_array_left_d_places 
{
    static void rotate_left_d(int arr[],int n, int d)
    {
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
           temp[i]=arr[i]; 
        }
        
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }

        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[i-(n-d)];
        }

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

        System.out.println("Ener the number of places you want to rotate : ");
        int d=sc.nextInt();
        
        rotate_left_d(arr, n, d);
        sc.close();
    }   
}
