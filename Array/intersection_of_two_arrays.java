import java.util.*;
public class intersection_of_two_arrays
{
    static int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        
        for(int x:nums1)
        set.add(x);

        for(int x: nums2)
        {
            if(set.contains(x))
            ans.add(x);
        }

        return ans.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array 1 : ");
        int n1 = sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter " + n1 + " elements : ");
        for (int i = 0; i < n1; i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter the size of the array 2 : ");
        int n2 = sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter " + n2 + " elements : ");
        for (int i = 0; i < n2; i++)
        arr2[i]=sc.nextInt();
        
        System.out.println("The intersection of both the array is: "+ Arrays.toString(intersection(arr1, arr2)));
        sc.close();     
    }   
}