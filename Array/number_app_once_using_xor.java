import java.util.Scanner;

public class number_app_once_using_xor 
{
    static void numberAppearingOnce(int arr[],int n)
    {
        int xor=0;
        for(int i=0;i<n;i++)
        xor=xor^arr[i];

        System.out.println("The number appearing once among others appearing twice is : "+xor);
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

        numberAppearingOnce(arr, n);
        sc.close();     
    }    
}    

