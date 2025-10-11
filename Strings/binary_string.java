import java.util.*;
class binary_string {
    static int binarySubstring(String s) {
        // brute
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='1')
                    count++;
                }
            }
        }
        return count;

        //optimal
        /*for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            count++;
        }
        return (count*(count-1))/2;*/
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your String: ");
            String str=sc.nextLine();
    
            System.out.println("The substrings of given String are: "+binarySubstring(str));
    
            sc.close();
    }
}