import java.util.*;
public class sum_n_numbers 
{
    int sum(int n)
    {
        if(n==0)
        return 0;
        else
        return n+sum(n-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");   
        int n=sc.nextInt();
        sum_n_numbers obj=new sum_n_numbers();
        int result=obj.sum(n);
        System.out.println("The sum of first "+n+" natural numbers is: "+result);
        sc.close();
    }
}
