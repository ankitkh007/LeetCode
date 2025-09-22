import java.util.*;;
public class setMatrixZeroes 
{
    // static int n,m;
    // static int arr[][] = new int[n][m];
    static void set_matrix(int arr[][],int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    setRow(arr,i,m);
                    setColumn(arr,j,n);
                }
            }
        }
        //check for -1 and set it to 0
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==-1)
                arr[i][j]=0;
            }
        }

        //display final matrix
        System.out.println("The final Matrix after operation is : ");
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    //function to set rows to -1
    static void setRow(int arr[][],int i,int m)
    {
        for(int j=0;j<m;j++)
        {
            if(arr[i][j]!=0)
            arr[i][j]=-1;
        }
    }
    //function to set columns to -1
    static void setColumn(int arr[][],int j,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i][j]!=0)
            arr[i][j]=-1;
        }
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
        set_matrix(arr, n, m);
        sc.close();
    }
}