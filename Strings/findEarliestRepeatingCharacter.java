import java.util.*;
public class findEarliestRepeatingCharacter 
{
    static char findEarliestChar(String s)
    {
        int idx_diff=0;
        int min_diff=Integer.MAX_VALUE;
        char erc=' '; //to store earliest repeating character

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++) //traverse through the entire string
        {
            char ch=s.charAt(i);

            if(map.containsKey(ch))
            {
                idx_diff=i-map.get(ch);
                if(idx_diff<min_diff)
                {
                    min_diff=idx_diff;
                    erc=ch;
                }
            }

            map.put(ch, i);
        }

        return erc;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=sc.nextLine();

        char ch=findEarliestChar(str);
        if(ch==' ')
        System.out.println("No repeating character found.");
        else
        System.out.println("The earliest repeating character is: "+ch);

        sc.close();
    }   
}   