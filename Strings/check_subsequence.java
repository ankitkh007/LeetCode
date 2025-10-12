import java.util.*;
public class check_subsequence 
{
    static boolean isSubSeq(String s1, String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int i=0,j=0;

        //two pointer approach for find the subsequence
        while(i<n && j<m)
        {
            if(s1.charAt(i)==s2.charAt(j))
            i++;

            j++;
        }

        return i==n; //if we have reached the end of s1 that means all the charcaters in s1 are present in s2
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st String(s1): ");
        String str1=sc.nextLine();
        System.out.println("Enter your 2nd String(s2): ");
        String str2=sc.nextLine();

        if(isSubSeq(str1,str2))
        System.out.println("The given String(s1) is a subsequence String(s2)");
        else
        System.out.println("The given String(s1) is not a subsequence String(s2");

        sc.close();
    }    
}