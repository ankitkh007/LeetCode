import java.util.*;
public class print_name
{
    void name(int i,int n)
    {
        if(i>n)
        return;
        System.out.println("Ankit");
        name(i+1,n);
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you want to print your name:");
        int n=sc.nextInt();
        print_name obj=new print_name();
        obj.name(1,n);
        sc.close();
    }
}