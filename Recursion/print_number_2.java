import java.util.*;
public class print_number_2
{
    void number(int n)
    {
        if(n<1)
        return;
        System.out.println(n);
        number(--n);
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        print_number_2 obj=new print_number_2();
        obj.number(n);
        sc.close();
    }
}