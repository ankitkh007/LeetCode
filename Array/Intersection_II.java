import java.util.*;
public class Intersection_II
{
    static int[] intersection(int[] nums1, int[] nums2)
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int x:nums1)
        map.put(x, map.getOrDefault(x, 0)+1);

        for(int x: nums2)
        {
            if(map.containsKey(x) && map.get(x)>0)
            {
                list.add(x);
                map.put(x, map.get(x)-1);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        ans[i]=list.get(i);

        return ans;
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