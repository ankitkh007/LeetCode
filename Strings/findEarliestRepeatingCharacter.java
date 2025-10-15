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

            if(map.containsKey(ch)) //map contains the current character
            {
                idx_diff=i-map.get(ch); //calculate the difference between previous index and cureent index
                if(idx_diff<min_diff)  //if the index difference < minimum difeerence 
                {
                    min_diff=idx_diff; //update the minimum difference
                    erc=ch; //store the current character
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