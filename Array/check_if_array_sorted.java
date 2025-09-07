import java.util.*;
public class check_if_array_sorted 
{
    static boolean check(List<Integer> arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr.get(i)<arr.get(i-1))
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        
        List<Integer> arr=new ArrayList<>();
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());

        boolean f=check(arr, n);
        if(f)
        System.out.println("The given array is sorted.");
        else
        System.out.println("The given array is not sorted.");
        sc.close();
    }   
}
