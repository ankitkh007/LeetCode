import java.util.*;
public class majorityElements 
{
    static int findMajorityElement(int arr[])
    {
        /*//brute approach
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(count>(arr.length/2))
            return arr[i];
        }
        return -1;*/

        //Hash Map technique
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            if(map.get(arr[i])>arr.length/2)
            return arr[i];
        }
        return -1;
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
        
        System.out.println("The majority element occuring is : "+ findMajorityElement(arr));
        sc.close();
    }
}