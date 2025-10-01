import java.util.*;
public class second_largest
{
    /*static void s_largest(List<Integer> arr,int n)
    {
        int largest=arr.get(0);
        int slargest=-1;
        for(int i=1;i<n;i++)
        {
            if(arr.get(i)>=largest)
            {
                slargest=largest;
                largest=arr.get(i);
            }
            else if(arr.get(i)<largest && arr.get(i)>slargest)
            slargest=arr.get(i);
        }
        System.out.println("The second largest element in the array is : "+ slargest);
    }*/

    //My approach
    static void s_largest(List<Integer> arr,int n)
    {
        int smallest=Integer.MAX_VALUE;
        int s_smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int s_largest=Integer.MIN_VALUE;

        for(int i: arr)
        {
            if(i<smallest) smallest=i;
            if(i>largest) largest=i;
        }

        for(int i: arr)
        {
            if(i>smallest)
            s_smallest=Math.min(i,s_smallest);
            if(i<largest)
            s_largest=Math.max(i, s_largest);
        }
        System.out.println("The second smallest element in the array is : "+ s_smallest);
        System.out.println("The second largest element in the array is : "+ s_largest);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        
        List<Integer> arr=new ArrayList<>();
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        arr.add(sc.nextInt());

        s_largest(arr, n);
        sc.close();
    }
}