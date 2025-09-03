import java.util.*;
public class fibonacci {
    static int fibo(int i)
    {
        if(i<=1)
        return i;
        //int last=fibo(i-1);
        //int slast=fibo(i-2);
        //return last+slast;
        return fibo(i-1)+fibo(i-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("The "+n+"th"+" Fibonacci is : "+fibo(n));
        sc.close();
    }
}
