import java.util.*;
class panagram 
{
    static final int MAX_CHAR=26;
    public static boolean checkPangram(String s) 
    {
        /*boolean visited[]=new boolean[MAX_CHAR];
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            visited[ch-'A']=true;
            else if(ch>='a' && ch<='z')
            visited[ch-'a']=true;
        }
        
        for(int i=0;i<MAX_CHAR;i++)
        {
            if(!visited[i])
            return false;
        }
        return true;*/

        //new approach
        Set<Character> set=new HashSet<>();
        int n=s.length();
        s=s.toLowerCase();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            set.add(s.charAt(i));
        }
        
        return set.size()==26;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your String: ");
            String str=sc.nextLine();

            if(checkPangram(str))
            System.out.println("The given String is a Panagram String");
            else
            System.out.println("The given String is not a Panagram String");
    
            sc.close();
    }
}