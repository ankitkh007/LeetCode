import java.util.*;
public class arrange_coins
{
    static int arrangecoins(int n)
    {
        for(int i=1; ;i++)
        {
            if(n-i<=0)
            return i-1;
            else
            n-=i; 
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the coins limit: ");
        int coins=sc.nextInt();

        System.out.println("Total completed rows are: "+ arrangecoins(coins));
        sc.close(); 
    }
}