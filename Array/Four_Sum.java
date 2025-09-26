import java.util.*;
public class Four_Sum
{
    static List<List<Integer>> fourSum(int[] nums,int target) 
    {
      Set<List<Integer>> st=new HashSet<>(); //it will contain unique triplet sets
      for(int i=0;i<nums.length;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {
            Set<Integer> store=new HashSet<>(); //forevery new iteration creates an empty set for storing elements b/w i and j
            for(int k=j+1;k<nums.length;k++)
            {
                int sum=nums[i]+nums[j]+nums[k];
                int fourth=target-sum;

                if(store.contains(fourth)) //if set contains the fourth element
                {
                    List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k],fourth); //make a new list and add all the three elements
                    list.sort(null); //sort the list
                    st.add(list); //add the list in this set(so that we only pick the unique triplets)
                }
            store.add(nums[k]); //if set does not contains the third element
            }
        }
      }
      List<List<Integer>> ans= new ArrayList<>(st); //finally stores all the unique triplet sets to aur answer list
      return ans;  
    }

    //optimal approach
    /*static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
        System.out.println("Enter the sum you want : ");
        int k = sc.nextInt();

        System.out.println("The indexes having target sum is " + fourSum(arr,k));
        sc.close();
    }
}