import java.util.*;
public class Kth_element_of_two_sorted_arrays
{
    static int KthElement(int nums1[], int nums2[], int k)
    {
        int n1=nums1.length, n2=nums2.length;
        if(n1>n2) return KthElement(nums2, nums1, k);

        int left=k; //length of left half
        int low=Math.max(0,k-n2), high=Math.min(k, n1);

        while(low<=high)
        {
            int mid1=(low+high) >> 1;
            int mid2=left-mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];

            if(l1<=r2 && l2<=r1)
            return Math.max(l1, l2);

            else if(l1>r2)
            high=mid1-1;
            else
            low=mid1+1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];

        System.out.println("Enter "+n1+" elements:");
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter the size of array 2: ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];

        System.out.println("Enter "+n2+" elements:");
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();

        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        
        System.out.println("The median of both the arrays is: "+KthElement(arr1, arr2, k));

        sc.close();
    }
}