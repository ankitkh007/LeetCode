import java.util.*;
public class leaders_in_Array
{
    static List<Integer> leaders(int nums[])
    {
        //brute approach
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int check=nums[i];
            int flag=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>check)
                flag=0;
            }
            if(flag==0)
            continue;
            else
            list.add(check);
        }
        return list;
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