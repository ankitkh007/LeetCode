import java.util.*;
public class linear_search 
{
    static boolean search(int arr[], int n, int s)
    {
        if(arr[0]==s || arr[n-1]==s)
        return true;

        for(int i=1;i<n-1;i++)
        {
            if(arr[i]==s)
            return true;
        }
        return false;
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
        
        System.out.println("Enter the number you want to search for?: ");
        int s=sc.nextInt();

        boolean flag=search(arr, n, s);
        if(flag)
        System.out.println("Number Found");
        else
        System.out.println("Number not Found");
        sc.close();        
    }    
}