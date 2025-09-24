import java.util.*;
public class majorityElements2 
{
    //TC-->O(n) & SC-->O(n)
    /*static List<Integer> findMajorityElements(int nums[])
    {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i, 0)+1);
            if(map.get(i)>nums.length/3)
            ans.add(i);
        }
        return ans;
    }*/

    //Extended Moore's Algo 
    static List<Integer> findMajorityElements(int nums[])
    {
        List<Integer> ans=new ArrayList<>();
        int count1=0,count2=0;
        int element1=0,element2=0;

        for(int i:nums)
        {
            if(count1==0)
            {
                count1=1;
                element1=i;
            }
            else if(count2==0)
            {
                count2=1;
                element2=i;
            }
            else if(i==element1)
            count1++;
            else if(i==element2)
            count2++;
            else
            {
                count1--;
                count2--;
            }
        }

        //validation
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if(element1==i)
            count1++;
            else if(element2==i)
            count2++;
        }
        if(count1>nums.length/3)
        ans.add(element1);
        if(count2>nums.length/3)
        ans.add(element2);

        return ans;

        //Final TC-->O(n)+O(n) ~= O(n)
        //SC--> O(1)
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
        
        System.out.println("The majority element occuring is : "+ findMajorityElements(arr));
        sc.close();    
    }    
}