import java.util.Scanner;
public class missing_number_using_xor 
{
    static void findMissing(int arr[],int k)
    {
        int xor1=0,xor2=0;
        for(int i=0;i<k-1;i++)
        {
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^k;
        System.out.println("The missing number is : "+(xor1^xor2));
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

        System.out.println("Enter till what number you want to search : ");
        int k = sc.nextInt();
        
        findMissing(arr,k);
        sc.close();     
    }    
}
