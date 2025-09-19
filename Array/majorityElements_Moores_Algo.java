import java.util.*;
public class majorityElements_Moores_Algo
{
    static int MooresVotingAlgo(int arr[])
    {
        int count=0;
        int element=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            element=arr[i];
            if(element==arr[i])
            count++;
            else
            count--;
        }

        //if no majority element exists(optional if there always exists one majority element)
        count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            count++;
            if(count>arr.length/2)
            return element;
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
        
        System.out.println("The majority element occuring is : "+ MooresVotingAlgo(arr));
        sc.close();
    }
}