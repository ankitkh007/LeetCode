import java.util.*;
public class row_with_max_ones
{
    //finds the lower bound of 1 ie starting index of 1
    static int getlowerBound(int nums[],int target)
    {
        int low=0,high=nums.length-1;
        int ans=nums.length;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }

        return ans;
    }

    static int getRowWithMaxOnes(int matrix[][], int row, int col)
    {
        int max_ones=0;
        int row_idx=-1;

        for(int i=0;i<row;i++)
        {
            int count_ones=col-getlowerBound(matrix[i], 1); //count_ones=total no. of columns-first index of 1
            if(count_ones>max_ones)                               //since matrix is sorted; if we get the first index of 1
            {
                max_ones=count_ones;
                row_idx=i;
            }
        }
        return row_idx;                                                         
    }
    public static void main(String[] args)
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

        System.out.println("The row with maximum 1's is: "+ getRowWithMaxOnes(matrix,row,col));
        sc.close();
    }
}