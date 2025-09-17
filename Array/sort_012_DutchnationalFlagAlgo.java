import java.util.*;
public class sort_012_DutchnationalFlagAlgo
{
    static void sort012(int[] arr) 
    {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            mid++;
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
                mid++;
            }
        }

        System.out.println("The sorted array is : ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+ " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

        sort012(arr);

        sc.close();
    }
}

//TC--> O(n)
//SC--> O(1)