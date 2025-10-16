import java.util.*;
public class FirstandLast_Occurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        System.out.println("Enter the number you want to search: ");
        int x=sc.nextInt();

        //lower_bound ob1=new lower_bound();
        //upper_bound ob2=new upper_bound();

        int lb=lower_bound.getlowerBound(arr, x);
        int ub=upper_bound.getUpperBound(arr, x);

        //validate edge cases
        if(lb==arr.length || arr[lb]!=x)
        System.out.println("-1, -1");
        else
        System.out.println("The first and last occurence of "+x+" is: "+lb+" & "+(ub-1));

        sc.close();
    }    
}