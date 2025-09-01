import java.util.*;
public class factorial_recursion 
{
    int fact(int n)
    {
        if(n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");   
        int n=sc.nextInt();
        factorial_recursion obj=new factorial_recursion();
        int result=obj.fact(n);
        System.out.println("The factorial of first "+n+" natural numbers is: "+result);
        sc.close();
    }
}
