import java.util.*;
public class firstNonRepeatingCharacter 
{
    static char findNonRepeatChar(String s)
    {
        int freq[]=new int[256];

        for(int i=0;i<s.length();i++)
        freq[s.charAt(i)]++;

        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)]==1)
            return s.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=sc.nextLine();

        System.out.println(findNonRepeatChar(str));
        sc.close();
    }      
}