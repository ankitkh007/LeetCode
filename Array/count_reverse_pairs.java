import java.util.*;
public class count_reverse_pairs
{
    static int m_sort(List<Integer> arr,int low, int high)
    {
       int count=0;
       if(low>=high)
       return count;
       int mid=(low+high)/2;
       count+=m_sort(arr,low,mid); //Divide left half
       count+=m_sort(arr, mid+1, high); //Divide right half
       count+=countPairs(arr,low,mid,high); //counts valis pairs before merging
       merge(arr,low,mid,high); //MERGE divided elements

       return count;
    }

    static int countPairs(List<Integer> arr, int low, int mid, int high)
    {
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && arr.get(i)>2*arr.get(right)) right++;
            count+=(right-(mid+1));
        }
        return count;
    }

    static void merge(List<Integer> arr, int low, int mid, int high)
    {
        List<Integer> temp = new ArrayList<>(); //Creation of temporary ArrayList
        int left=low; //left half
        int right=mid+1; //right half

        while(left<=mid && right<=high)
        {
            if(arr.get(left) <= arr.get(right)) //compairing and pushing into temp ArrayList
            {
                temp.add(arr.get(left));
                left++;
            }
            else //right is smaller
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

        System.out.println("Total valid reverse pairs are : "+  m_sort(arr, 0, n-1));
        sc.close();
    }
}

// Time Complexity
// Best,Avg,Worst = O(n log n)