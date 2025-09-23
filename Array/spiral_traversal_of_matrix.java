import java.util.*;
public class spiral_traversal_of_matrix 
{
    static List<Integer> spiralOrder(int matrix[][])
    {
        int left=0,right=matrix[0].length-1;
        int top=0, bottom=matrix.length-1;
        List<Integer> ans=new ArrayList<>();

        while(left<=right && top<=bottom)
        {
            //left-->right
            for(int i=left;i<=right;i++)
            ans.add(matrix[top][i]);
            top++;

            //top-->bottom
            for(int i=top;i<=bottom;i++)
            ans.add(matrix[i][right]);
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                ans.add(matrix[bottom][i]);
                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                ans.add(matrix[i][left]);
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int m = sc.nextInt();
        System.out.println("Enter the elements : ");
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            arr[i][j]=sc.nextInt();
        }
        System.out.println("The spiral traversal of the given amtrix is : " + spiralOrder(arr));
        sc.close();    
    }    
}