import java.util.*;
public class rearrange_array_with_sign 
{
    static int[] sortedarray(int arr[])
    {
        //Variant 1
        int ans[]=new int[arr.length];
        int pos=0,neg=1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                ans[pos]=arr[i];
                pos+=2;
            }
            else
            {
                ans[neg]=arr[i];
                neg+=2;
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

//Variant 1
//TC--> O(n)
//SC--> O(n)