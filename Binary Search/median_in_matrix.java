import java.util.*;
public class median_in_matrix
{
    static int getUpperBound(int nums[],int target)
    {
        int low=0,high=nums.length-1;
        int ans=nums.length;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    static int countSmallEquals(int matrix[][], int row, int col, int x)
    {
        int count=0;
        for(int i=0;i<row;i++)
        count+=getUpperBound(matrix[i], x);

        return count;
    }
    static int median(int matrix[][], int row, int col)
    {
        int low=Integer.MAX_VALUE, high=Integer. MIN_VALUE;
        for(int i=0;i<row;i++)
        {
            low=Math.min(low, matrix[i][0]);
            high=Math.max(high, matrix[i][col-1]);
        }

        int req=(row*col)/2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int smallEquals=countSmallEquals(matrix, row, col, mid);
            if(smallEquals<=req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];

        System.out.println("Enter the elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            matrix[i][j]=sc.nextInt();
        }

        System.out.println("The median in the matrix is: "+median(matrix, row, col));
        sc.close();
    }
}