import java.util.*;
public class substrings_of_a_string
{
    static List<String> generateSubstrings(String str)
    {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                ans.add(str.substring(i, j+1));
            }
        }

        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=sc.nextLine();

        System.out.println("The substrings of given String are: "+generateSubstrings(str));

        sc.close();
    }
}