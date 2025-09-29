import java.util.*;
public class missing_repeating_number 
{
    /*static long[] findRepeatingMissing(int arr[])
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
    }*/

    //Mathematical approach
    static long[] findRepeatingMissing(int arr[])
    {
        long n= arr.length;
        long s1n=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        long s1=0,s2=0;
        
        for(int i=0;i<n;i++)
        {
            s1+=(long)arr[i];
            s2+=(long)(arr[i]*arr[i]);
        }

        //s1-s1n=x-y & s1=s2n=(x+y)(x-y)
        long eq1=s1-s1n; // x-y
        long eq2=s2-s2n; // (x-y)(x+y)
        eq2=eq2/eq1;     // (x-y)(x+y)/(x-y)=(x+y)

        long x=(eq1+eq2)/2; //here we get the repeating number
        long y=eq2-x;       //here we get the missing number
        
        long ans[]=new long[2];
        ans[0]=x;
        ans[1]=y;

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