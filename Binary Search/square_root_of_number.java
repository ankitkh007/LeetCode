import java.util.*;
public class square_root_of_number
{
    static int getSquareRoot(int n)
    {
        int low=1,high=n;
        int ans=1;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if((mid*mid)<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        System.out.println("The square root of the number is: "+getSquareRoot(n));
        sc.close();
    }
}