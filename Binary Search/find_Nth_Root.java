import java.util.*;
public class find_Nth_Root
{
    static int getNthRoot(int x, int n)
    {
        int low=1,high=x;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long value=getPower(mid, n, x);
            if(value==x)
            return mid;
            else if(value>x)
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }

    static int getPower(int base, int power, int limit)
    {
        long ans=1;
        for(int i=1;i<=power;i++)
        {
            ans*=base;
            if(ans>limit) return limit+1; //if ans at any point while iteration exceeds our original limit(which is x) then simply break
        }

        return (int)ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();

        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        System.out.println("The square root of the number is: "+getNthRoot(x,n));
        sc.close();
    }
}
