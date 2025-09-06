import java.util.*;
public class merge_sort 
{
    static void m_sort(List<Integer> arr,int low, int high)
    {   
       if(low>=high)
       return;
       int mid=(low+high)/2;
       m_sort(arr,low,mid); //Divivde left half
       m_sort(arr, mid+1, high); //Divivde right half
       merge(arr,low,mid,high); //MERGE divided elements
    }

    static void merge(List<Integer> arr, int low, int mid, int high)
    {
        List<Integer> temp = new ArrayList<>(); //Creation of temporary ArrayList
        int left=low; //left half
        int right=mid+1; //right half

        while(left<=mid && right<=high)
        {
            if(arr.get(left) <= arr.get(right)) //compiaring and pushing into temp ArrayList
            {
                temp.add(arr.get(left));
                left++;
            }
            else
            {
                temp.add(arr.get(right));
                right++;
            }
        }

        //For leftover elements
        while (left<=mid) 
        {
            temp.add(arr.get(left));
            left++;
        }
        while (right<=high) 
        {
            temp.add(arr.get(right));
            right++;
        }

        //Updating Original List with the sorted values
        for(int i=low;i<=high;i++)
        arr.set(i, temp.get(i - low));
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>(); //Creation of Array List

        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt()); // Pushing elements into the Array List

        m_sort(arr, 0, n-1); // calling Merge function(ArrayList,low,high)
        System.out.println("The sorted elements are : ");
        for(int i=0;i<n;i++)
        System.out.print(arr.get(i)+" "); // Printing elements from the sorted ArrayList
        sc.close();
    }
}

// Time Complexity
// Best,Avg,Worst = O(n log n)