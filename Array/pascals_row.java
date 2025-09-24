import java.util.*;
public class pascals_row 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row no. : ");
        int n=sc.nextInt();

        int ans=1;
        System.out.print(ans+" ");
        
        for(int i=1;i<n;i++)
        {
            ans=ans*(n-i)/i;
            System.out.print(ans+" ");
        }
        sc.close();
    }    
}