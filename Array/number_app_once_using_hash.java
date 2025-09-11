import java.util.Scanner;

public class number_app_once_using_hash
{
    static void numberAppearingOnce(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        
        int hash[]=new int[max+1];
        for(int i=0;i<n;i++)
        hash[arr[i]]++;

        for(int i=1;i<=max;i++)
        {
            if(hash[i]==1)
            System.out.println("The number appearing once among others appearing twice is : "+ i);
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

        numberAppearingOnce(arr, n);
        sc.close();     
    }    
}    

