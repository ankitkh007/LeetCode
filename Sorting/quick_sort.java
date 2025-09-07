import java.util.*;
public class quick_sort
{
    static void q_sort(List<Integer> arr,int low,int high)
    {
        if(low<high)
        {
            int partition_index=partition(arr,low,high);
            q_sort(arr,low,partition_index-1);
            q_sort(arr, partition_index+1, high);
        }
    }

    static int partition(List<Integer> arr,int low, int high)
    {
        int pivot=arr.get(low);
        int i=low;
        int j=high;

        while(i<j)
        {
            while (arr.get(i)<=pivot && i<=high-1) 
            i++;

            while(arr.get(j)>pivot && j>=low+1)
            j--;

            if(i<j)
            Collections.swap(arr, i, j);
        }
        Collections.swap(arr, low, j);

        return j;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();

        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());

        q_sort(arr, 0,n-1);
        System.out.println("The sorted elements are : ");
        for(int i=0;i<n;i++)
        System.out.print(arr.get(i)+" ");
        sc.close();    
    }
}

// Time Complexity
// Best,Avg,Worst = O(n log n)