import java.util.*;
public class character_freq 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter any string : ");
        String s=sc.nextLine();

        Map<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            freq.merge(s.charAt(i), 1, Integer::sum);
        }
        System.out.println(freq);
        sc.close();

        for(Map.Entry<Character,Integer> e: freq.entrySet())
        {
            System.out.println("Value "+e.getKey()+" occurs "+e.getValue()+" times");
        }
    }
}