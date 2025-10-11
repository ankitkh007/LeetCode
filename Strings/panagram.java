import java.util.*;
class panagram 
{
    static final int MAX_CHAR=26;
    public static boolean checkPangram(String s) 
    {
        boolean visited[]=new boolean[MAX_CHAR];
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
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your String: ");
            String str=sc.nextLine();
    
            System.out.println("The substrings of given String are: "+checkPangram(str));
    
            sc.close();
    }
}