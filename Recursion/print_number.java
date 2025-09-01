import java.util.*;
public class print_number
{
    void number(int i,int n)
    {
        if(i>n)
        return;
        System.out.println(i);
        number(i+1,n);
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        print_number obj=new print_number();
        obj.number(1,n);
        sc.close();
    }
}