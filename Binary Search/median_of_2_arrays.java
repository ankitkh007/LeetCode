import java.util.Scanner;
public class median_of_2_arrays
{
    /*static double median(int nums1[], int nums2[])
    {
        int n1=nums1.length, n2=nums2.length;
        int n=(n1+n2);
        int i=0,j=0;
        int ind2=n/2;
        int ind1=ind2-1;
        int ind1val=-1, ind2val=-1;
        int count=0;
        
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                if(count==ind1) ind1val=nums1[i];
                if(count==ind2) ind2val=nums1[i];
                count++;
                i++;
            }
            else
            {
                if(count==ind1) ind1val=nums2[j];
                if(count==ind2) ind2val=nums2[j];
                count++;
                j++;
            }
        }

        while(i<n1)
        {
            if(count==ind1) ind1val=nums1[i];
            if(count==ind2) ind2val=nums1[i];
            count++;
            i++;
        }
        while(j<n2)
        {
            if(count==ind1) ind1val=nums2[j];
            if(count==ind2) ind2val=nums2[j];
            count++;
            j++;
        }

        return ((ind1val+ind2val)/2.0);
    }*/

    //Binary Search approach
    static double median(int nums1[], int nums2[])
    {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1>n2) return median(nums2, nums1);

        int low = 0, high = n1;

        // Binary search on the smaller array
        while (low <= high) {
            // Calculate cut points for both arrays
            int mid1 = (low + high) / 2;
            int mid2 = (n1 + n2 + 1) / 2 - mid1;

            // Get values to the left and right of the partition
            // Use Integer.MIN_VALUE and MAX_VALUE to handle edge cases
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];

            // If partition is valid
            if (l1 <= r2 && l2 <= r1) {
                // Even total elements => average of two middle elements
                if ((n1 + n2) % 2 == 0)
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else
                    // Odd total elements => max of left parts
                    return Math.max(l1, l2);
            }
            // Move left in array a
            else if (l1 > r2)
                high = mid1 - 1;
            // Move right in array a
            else
                low = mid1 + 1;
        }

        return 0.0; 
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
        
        System.out.println("The median of both the arrays is: "+median(arr1, arr2));

        sc.close();
    }
}