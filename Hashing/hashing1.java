import java.util.*;
public class hashing1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        //preallocate
        int hash[] = new int[13];

        //update the frequency of respective values 
        for(int i=0;i<n;i++)
        hash[arr[i]]+=1;

        System.out.println("Enter the number of queries you want to search for : ");
        int q=sc.nextInt();

        System.out.println("Enter your queries : ");
        while(q!=0)
        {
            int num;
            num=sc.nextInt();
            System.out.print("Total frequency of "+num+" is = ");
            System.out.println(hash[num]);
            q--;
        }
        sc.close();
    }    
}
