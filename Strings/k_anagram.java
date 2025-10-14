import java.util.*;
public class k_anagram
{
    static boolean isKAnagram(String s1,String s2, int k)
    {
        if(s1.length()!=s2.length())
        return false;

        HashMap<Character, Integer> map=new HashMap<>();

        //Traverse through 1st String and increment the frequency of each character
        for(char ch:s1.toCharArray())
        map.put(ch, map.getOrDefault(ch, 0)+1);

        //Traverse through 2nd String and decrememt the frequency of each character
        for(char ch:s2.toCharArray())
        {
            if(map.getOrDefault(ch, 0)>0)//decrement the frequency of only those characters which are already present
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }

        int sum=0;
        for(char ch: map.keySet()) //if frequency of every character in the HashMap is zero then the Strings the Anagrams 
        sum+=map.get(ch);

        return (sum>k) ? false: true;

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st String(s1): ");
        String str1=sc.nextLine();
        System.out.println("Enter your 2nd String(s2): ");
        String str2=sc.nextLine();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();

        if(isKAnagram(str1,str2,k))
        System.out.println("The given String(s1) is a valid K-Anagram of String(s2)");
        else
        System.out.println("The given String(s1) is not a valid K-Anagram of String(s2");

        sc.close();
    }    
}