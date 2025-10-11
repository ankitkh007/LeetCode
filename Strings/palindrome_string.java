import java.util.*;
public class palindrome_string 
{
    static boolean checkPalindrome(String s)
    {
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=sc.nextLine();
    
        if(checkPalindrome(str))
        System.out.println("The given String is Plaindrome");
        else
        System.out.println("The given String is not a Plaindrome");
        sc.close();
    }    
}