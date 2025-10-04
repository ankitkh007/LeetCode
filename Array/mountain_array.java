import java.util.Scanner;

public class mountain_array
{
    static public boolean validMountainArray(int[] arr) 
    {
        if(arr.length<3)
        return false;

        else
        {
            int max=0;
            for(int i=0;i<arr.length;i++)  
            {
                if(arr[i]>arr[max])
                max=i;
            }
            if(max==arr.length-1 || max==0) //if max-valued element is at the beginning or end then return false
            return false;
            
            int flag=1;
            for(int i=1;i<max;i++) //check all the elements before max is less or not; if not set flag=0
            {
                if(arr[i-1]>=arr[i])
                flag=0;
            }
            for(int i=max;i<arr.length-1;i++) //check all the elements after max is greater or not; if not set fag=0
            {
                if(arr[i]<=arr[i+1])
                flag=0;
            }

            if(flag==0)
            return false;
            else
            return true;
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

        boolean check=validMountainArray(arr);
        if(check)
        System.out.println("It's a valid Mountain Array.");
        else
        System.out.println("It's not a valid Mountain Array.");
        sc.close();     
    }    
}