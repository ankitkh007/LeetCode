import java.util.*;
public class subsequences_recursion 
{
    static  void printsubsequences(int arr[], int i, List<Integer> path)
    {
        if(i==arr.length)
        {
            System.out.println(path);
            return;
        }
        //chosse arr[i]
        path.add(arr[i]);
        printsubsequences(arr, i+1, path);

        //backtrack
        path.remove(path.size()-1);

        //skip arr[i]
        printsubsequences(arr, i+1, path);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to elements you want in the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements : ");
        for (int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        System.out.println("All Subsequences of " + Arrays.toString(arr)+ ":");
        printsubsequences(arr,0, new ArrayList<>());
        sc.close();
    }    
}
