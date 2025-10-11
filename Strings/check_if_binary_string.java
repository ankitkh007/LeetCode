import java.util.*;
public class check_if_binary_string 
{
    static boolean isBinary(String s) {
        // Your code here
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0' && s.charAt(i)!='1')
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your String: ");
            String str=sc.nextLine();
    
            System.out.println("The substrings of given String are: "+isBinary(str));
    
            sc.close();
    }
}