import java.util.*;
public class checkStringRotation 
{
    static boolean areRotations(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        return false;

        s1=s1+s1; //add same string to itself

        for(int i=0;i<s1.length()/2;i++)
        {
            String temp=s1.substring(i, s1.length()/2+i); //extracts consecutive substrings
            
            if(temp.equals(s2)) //if the extracted substring(or roatated string) is equal to string s2 return true
            return true;
        }

        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st String(s1): ");
        String str1=sc.nextLine();
        System.out.println("Enter your 2nd String(s2): ");
        String str2=sc.nextLine();
        
        System.out.println(areRotations(str1,str2));

        sc.close();    
    }  
}