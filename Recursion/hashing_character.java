import java.util.*;
public class hashing_character 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        // int arr[]=new int[];
        // System.out.println("Enter the elements : ");
        // for(int i=0;i<n;i++)
        // arr[i]=sc.nextInt();

        //preallocate
        int hash[] = new int[256];

        //update the frequency of respective values 
        for(int i=0;i<str.length();i++)
        hash[str.charAt(i)]+=1;

        System.out.println("Enter the number of queries you want to search for : ");
        int q=sc.nextInt();

        System.out.println("Enter your queries : ");
        while(q!=0)
        {
            char c;
            c=sc.next().charAt(0);
            System.out.print("Total frequency of "+c+" is = ");
            System.out.println(hash[c]);
            q--;
        }
        sc.close();
    }    
}