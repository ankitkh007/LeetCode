import java.util.*;
public class peak_element_II
{
    static int findMaxElement(int matrix[][], int row, int col)
    {
        int maxel=-1;
        int index=-1;
        for(int i=0;i<row;i++)
        {
            if(matrix[i][col]>maxel)
            {
                maxel=matrix[i][col];
                index=i;
            }
        }
        return index;
    }
    static int[] peakElement(int mat[][], int row, int col)
    {
        int low=0, high=col-1;
        int ans[]={-1,-1};
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row_number=findMaxElement(mat,row,mid);

            int left= mid-1>=0?mat[row_number][mid-1]:-1;
            int right= mid+1<col?mat[row_number][mid+1]:-1;

            if(mat[row_number][mid]>left && mat[row_number][mid]>right)
            {
                ans[0]=row_number; ans[1]=mid;
                return ans;
            }
            else if(left>mat[row_number][mid])
            high=mid-1;
            else
            low=mid+1;
        }
        return ans;
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

        System.out.println("The index of peak element is: "+Arrays.toString(peakElement(matrix, row, col)));
        sc.close();
    }
}