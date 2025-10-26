//exactly same as book_allocation
import java.util.*;
public class painters_partition
{
    static int getMaxValue(int arr[]) //returns the maximum value from the array
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        max=Math.max(max, arr[i]);

        return max;
    }

    static int sumall(int arr[]) //calculates the sum of all the lements in the array
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];

        return sum;
    }

    //fuction to check whether can we place all the cows with our preffered distance or not
    static int studentsCount(int arr[], int pageslimit)
    {
        int countStudents=1, pages=0;

        for(int i=0;i<arr.length;i++)
        {
            if(pages+arr[i]<=pageslimit) //if pagescount is within the limit just sum up the next page
            pages+=arr[i];

            else //else increase the students count and set the current page to the pages variable 
            {
                countStudents++;
                pages=arr[i];
            }
        }
        return countStudents;
    }

    //BS approach
    static int PaintersPartition(int arr[], int students)
    {
        if(students>arr.length) return -1;

        int low=getMaxValue(arr),high=sumall(arr); //range=(max(arr)-->sum(arr))
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(studentsCount(arr,mid)<=students) //if studentsCount<=students that means we need to reduce our pages limit provided so as to accommodate every student
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        System.out.println("Enter no. of painters: ");
        int stu=sc.nextInt();

        System.out.println("The minimum days required after all allocations is: "+ PaintersPartition(arr, stu));
        sc.close();
    }
}