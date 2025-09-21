import java.util.*;
public class leaders_in_Array
{
    static List<Integer> leaders(int nums[])
    {
        //brute approach TC-->O(n^2)
        List<Integer> list=new ArrayList<>();
        /*for(int i=0;i<nums.length;i++)
        {
            int flag=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>nums[i])
                flag=0;
            }
            if(flag==1)
            list.add(nums[i]);
        }
        return list;*/

        //optimal technique TC-->O(n)
        int max=nums[nums.length-1];
        list.add(max);
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                list.add(max);
            }
        }
        Collections.reverse(list); // to get the answer preserving the order
        return list;
    }
    static void reverse(List<Integer> list)
    {

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i]=sc.nextInt();
        
        System.out.println("The leaders are : "+ leaders(arr));
        sc.close();     
    }         
}