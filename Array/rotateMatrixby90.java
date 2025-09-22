import java.util.*;
public class rotateMatrixby90 
{
    //my approach
    static void rotate(int arr[][],int n)
    {
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j]=arr[(n-1)-j][i];
            }
        }

        //display final matrix
        System.out.println("The matrix after rotation is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(ans[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns (both are equal) : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j]=sc.nextInt();
        }
        rotate(arr, n);
        sc.close();
    }
}