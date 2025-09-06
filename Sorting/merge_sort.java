import java.util.*;
public class merge_sort 
{
    static void m_sort(List<Integer> arr,int low, int high)
    {   
       if(low>=high)
       return;
       int mid=(low+high)/2;
       m_sort(arr,low,mid);
       m_sort(arr, mid+1, high);
       merge(arr,low,mid,high);
    }

    static void merge(List<Integer> arr, int low, int mid, int high)
    {
        List<Integer> temp = null;
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high)
        {
            if(arr.get(left) <= arr.get(right))
            temp.add(arr.get(left));
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        m_sort(new ArrayList<>(), 0, n-1);
        System.out.println("The sorted elements are : ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}

// Time COmplexity
// Best = O(n)
// Avg,Worst = O(n^2)