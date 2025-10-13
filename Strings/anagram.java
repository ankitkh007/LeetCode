import java.util.*;
public class anagram
{
    static boolean isAnagram(String s1,String s2)
    {
        /*char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
        return true;
        else
        return false;*/

        //HashMap approach
        HashMap<Character, Integer> map=new HashMap<>();

        //Traverse through 1st String and increment the frequency of each character
        for(char ch:s1.toCharArray())
        map.put(ch, map.getOrDefault(ch, 0)+1);

        //Traverse through 2nd String and decrememt the frequency of each character
        for(char ch:s2.toCharArray())
        map.put(ch, map.getOrDefault(ch, 0)-1);

        for(var ch: map.entrySet()) //if frequency of every character in the HashMap is zero then the Strings the Anagrams 
        {
            if(ch.getValue()!=0)
            return false;
        }

        return true;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st String(s1): ");
        String str1=sc.nextLine();
        System.out.println("Enter your 2nd String(s2): ");
        String str2=sc.nextLine();

        if(isAnagram(str1,str2))
        System.out.println("The given String(s1) is a Anagram of String(s2)");
        else
        System.out.println("The given String(s1) is not a Anagram of String(s2");

        sc.close();
    }    
}