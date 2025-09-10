import java.util.Scanner;
public class max_consecutive_ones  
{
    static void max_ones(int arr[],int n)
    {
        int count=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max, count);
            }
            else
            count=0;
        }
        System.out.println("The maximum consecutive ones is : "+max);
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

        max_ones(arr, n);
        sc.close();     
    }    
}