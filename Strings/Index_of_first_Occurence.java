import java.util.*;
public class Index_of_first_Occurence
{
    static int strStr(String haystack, String needle) 
    {
        int n=haystack.length();
        int m=needle.length();
        int i=0,j=0;

        while(i<n && j<m)
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;

                if(j==m-1)
                return i-j;
            }
            else
            {
                i++;j=0;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter haystack: ");
        String hay=sc.nextLine();
        System.out.println("Enter needle: ");
        String ned=sc.nextLine();
        System.out.println(strStr(hay, ned));
        sc.close();
    }
}