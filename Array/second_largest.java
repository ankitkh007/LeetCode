import java.util.*;
public class second_largest
{
    static void s_largest(List<Integer> arr,int n)
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