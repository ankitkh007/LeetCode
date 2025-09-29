import java.util.*;
public class missing_repeating_number 
{
    static long[] findRepeatingMissing(int arr[])
    {
        int hash[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        hash[arr[i]]+=1;

        int repeating=-1,missing=-1;

        for(int i=1;i<=arr.length;i++)
        {
            if(hash[i]==2) repeating=i;
            else if(hash[i]==0) missing=i;

            if(repeating!=-1 && missing!=-1)
            break;
        }
        long ans[]=new long[2];
        ans[0]=repeating;
        ans[1]=missing;

        return ans;
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

        System.out.println("The repeating and missing number is : "+ Arrays.toString(findRepeatingMissing(arr)));
        sc.close();     
    }    
}