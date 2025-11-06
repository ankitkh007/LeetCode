import java.util.*;
public class valid_perfect_square
{
    static boolean isPerfectSquare(int num)
    {
        int low=0,high=num;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if((long)mid*mid==num) return true;
            else if((long)mid*mid<num) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        System.out.println(isPerfectSquare(n));
        sc.close();    
    }
}