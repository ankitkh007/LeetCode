import java.util.*;
public class remove_duplicates_sorted
{
    static int remove(List<Integer> arr,int n)
    {
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr.get(i)!=arr.get(j))
            {
                arr.set(i+1,arr.get(j));
                i++;
            }
        }
        return i+1;
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

        int k=remove(arr,n);
        System.out.println("The array after removing duplicates is : ");
        for(int i=0;i<k;i++)
        System.out.print(arr.get(i)+" ");
        sc.close();
    }   
}
