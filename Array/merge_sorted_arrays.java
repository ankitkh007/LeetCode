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

    //Leetcode approach TC-->O(m+n)
    /*public void merge(int[] nums1, int m, int[] nums2, int n) //here nums1[] ka actual length is m+n so that it accomodates both arrays
    {
        int i=m-1;//lst valid element of nums1
        int j=n-1;//last valid element of nums2
        int k=m+n-1;//last index of nums1

        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            nums1[k--]=nums1[i--];
            else
            nums1[k--]=nums2[j--];
        }
        
        while(j>=0)//if any element is left in nums2
        nums1[k--]=nums2[j--];
    }*/

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