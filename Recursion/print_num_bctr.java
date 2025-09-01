import java.util.*;
public class print_num_bctr
{
    void number(int n)
    {
        if(n<1)
        return;
        number(--n);
        System.out.println(n+1);
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        print_num_bctr obj=new print_num_bctr();
        obj.number(n);
        sc.close();
    }
}