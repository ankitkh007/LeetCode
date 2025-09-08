import java.util.Scanner;

public class rotate_left_or_right
{
    static void Reverse(int arr[], int start, int end)
    {
        //int temp=0;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate_left_d(int arr[],int n, int d,int choice)
    {   
        d = d % n; // handles if d>n

        if(choice==1)
        {
            Reverse(arr, 0, d - 1);
            Reverse(arr, d, n - 1);
            Reverse(arr, 0, n - 1);

            System.out.println("The array after rotating left by " +d+" place is : ");
            for (int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        }
        else
        {
            Reverse(arr,0,n-d-1);
            Reverse(arr,n-d,n-1);
            Reverse(arr,0,n-1);

            System.out.println("The array after rotating right by " +d+" place is : ");
            for (int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        }       
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

        System.out.println("Press 1 to rotate left : ");
        System.out.println("Press 2 to rotate right : ");
        System.out.println("Enter your choice : ");
        int choice=sc.nextInt();

        System.out.println("Ener the number of places you want to rotate : ");
        int d=sc.nextInt();
        
        rotate_left_d(arr, n, d, choice);
        sc.close();
    }   
}
