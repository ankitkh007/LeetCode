import java.util.*;
public class largest_element_in_array 
{
    static void largest_element(List<Integer> arr,int n)
    {
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)>=arr.get(l))
            l=i;
        }
        System.out.println("The largest element in the array is : "+ arr.get(l));
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

        largest_element(arr, n);
        sc.close();
    }
    
}