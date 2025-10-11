import java.util.*;
public class camel_case
{
    // Function to convert the given string to Camel Case
    static String convertToCamelCase(String s) {
        // code here
        int isSpace=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            isSpace=1;
            
            else if(isSpace==1)
            {
                ans.append(Character.toUpperCase(s.charAt(i)));
                isSpace=0;
            }
            else
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your String: ");
            String str=sc.nextLine();
    
            System.out.println("The Camel case of the String is: "+convertToCamelCase(str));
    
            sc.close();
    }

}

