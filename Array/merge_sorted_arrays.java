import java.util.*;
public class merge_sorted_arrays
{
    /*static void merge(int arr1[],int arr2[], int n,int m)
    {
        int arr3[]=new int[n+m];
        int left=0,right=0;
        int index=0;

        while(left<n && right<m)
        {
            if(arr1[left]<=arr2[right])
            {
                arr3[index]=arr1[left];
                left++;index++;
            }
            else
            {
                arr3[index]=arr2[right];
                right++;index++;
            }
        }
        while(left<n)
        arr3[index++]=arr1[left++];
        while(right<m)
        arr3[index++]=arr2[right++];

        System.out.println("The merged array is : ");
        for(int i=0;i<n+m;i++)
        System.out.print(arr3[i]+ " ");
    }*/

    //Optimal approach
    static void merge(int arr1[],int arr2[], int n,int m)
    {
        int left=n-1; //start left pointer from the end
        int right=0; //strat right pointer from the beginning

        while(left>=0 && right<m)
        {
            if(arr1[left]>arr2[right])
            {
                int temp=arr2[right];
                arr2[right]=arr1[left];
                arr1[left]=temp;
                left--;right++;
            }
            else
            break;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("The merged array is : ");
        for(int i=0;i<n;i++)
        System.out.print(arr1[i]+ " ");
        for(int i=0;i<m;i++)
        System.out.print(arr2[i]+ " ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array : ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter the size of the second array : ");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter "+m+" elements : ");
        for(int i=0;i<m;i++)
        arr2[i]=sc.nextInt();
        sc.close();
        
        merge(arr1, arr2, n, m);
    }
}