import java.util.*;
public class rearrange_array_with_sign 
{
    static int[] sortedarray(int nums[])
    {
        //Variety 1
        /*int ans[]=new int[nums.length];
        int pos=0,neg=1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[pos]=nums[i];
                pos+=2;
            }
            else
            {
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;*/

        //variety 2
        List<Integer> positive=new ArrayList<>();
        List<Integer> negative=new ArrayList<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            positive.add(nums[i]);
            else
            negative.add(nums[i]);
        }

        if(positive.size()>negative.size())
        {
            for(int i=0;i<negative.size();i++)
            {
                ans[i*2]=positive.get(i);
                ans[i*2+1]=negative.get(i);
            }
            int index=negative.size()*2;
            for(int i=negative.size();i<positive.size();i++)
            {
                ans[index]=positive.get(i);
                index++;
            }
        }
        else
        {
            for(int i=0;i<positive.size();i++)
            {
                ans[i*2]=positive.get(i);
                ans[i*2+1]=negative.get(i);
            }
            int index=positive.size()*2;
            for(int i=positive.size();i<negative.size();i++)
            {
                ans[index]=negative.get(i);
                index++;
            }
        }
        return ans;
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

        System.out.println("Rearranged array is : "+ Arrays.toString(sortedarray(arr)));
        sc.close();  
    }    
}

//Variety 1
//TC--> O(n)
//SC--> O(n)

//Variety 2
//TC--> O(2n)
//Sc--> O(n)