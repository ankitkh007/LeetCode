import java.util.*;
public class Buy_Sell_Stock 
{
    static int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            profit=Math.max(prices[i]-min,profit);
            min=Math.min(min,prices[i]);
        }
        return profit;        
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

        System.out.println("Maximum Profit that can be generated is : "+ maxProfit(arr));
        sc.close();  
    }    
}