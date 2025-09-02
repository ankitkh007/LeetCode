import java.util.*;
public class string_palin_recursion {
    static boolean ispalin(int i, String str)
    {
        if(i>=str.length()/2)
        return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        return false;
        return ispalin(i+1,str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println(ispalin(0,str));
        sc.close();
    }
}
