import java.util.Scanner;
public class missing_numbers_using_set
{
    static void findMissing(int arr[],int k)
    {
        int hash[]=new int[k+1];
        for(int i=0;i<arr.length;i++)
        hash[arr[i]]=1;

        for(int i=1;i<=k;i++)
        {
            if(hash[i]==0)
            System.out.println("The missing number is : "+i);
        }
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
