import java.util.*;
public class URLify 
{
    static String seturl(String s)
    {
        s=s.replace(" ", "%20");

        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str1=sc.nextLine();

        System.out.println("The Urlified String is: "+seturl(str1));
        sc.close();
    }        
}