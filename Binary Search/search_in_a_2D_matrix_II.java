import java.util.*;
public class search_in_a_2D_matrix_II
{
    static boolean searchElement(int matrix[][], int target, int n, int m)
    {
        int row=0,col=m-1;
        while(row<n && col>=0)
        {
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;
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

        System.out.println("Enter the target you want to search for: ");
        int target=sc.nextInt();

        System.out.println(searchElement(matrix, target, row, col));
        sc.close();
    }
}