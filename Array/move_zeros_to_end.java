import java.util.*;
public class move_zeros_to_end 
{
    static void move(int arr[],int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println("The array after moving all zeroes to end is : ");
        for (int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
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
        
        move(arr, n);
        sc.close();    
    }    
}