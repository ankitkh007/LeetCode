import java.util.*;;
public class setMatrixZeroes 
{
    //Brute approach
    /*static void set_matrix(int arr[][],int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    // setRow(arr,i,m);
                    // setColumn(arr,j,n);
                    //setRandC(arr,i,j,n,m);
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

    // static void setRandC(int arr[][],int i,int j,int n,int m) //Not feasible TC very large...
    // {
    //     for(int k=0;k<n;k++)
    //     {
    //         for(int l=0;l<m;l++)
    //         {
    //             if(k==i || l==j)
    //             arr[k][l]=-1;
    //         }
    //     }
    // }

    // //function to set rows to -1
    // static void setRow(int arr[][],int i,int m)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         if(arr[i][j]!=0)
    //         arr[i][j]=-1;
    //     }
    // }
    // //function to set columns to -1
    // static void setColumn(int arr[][],int j,int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         if(arr[i][j]!=0)
    //         arr[i][j]=-1;
    //     }
    // }*/

    //Better approach
    static void set_matrix(int arr[][],int n, int m)
    {
        int rows[]=new int[n]; //to store the position of rows where element is zero
        int col[]=new int[m];  //to store the position of columns where element is zero

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0) //checks for the position where arr[i][j]=0 and sets rows[pos] and col[pos] to 1 
                {
                    rows[i]=1; 
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++) //checks for the position where rows & columns were 1 and then sets arr[i][j]=0 
        {
            for(int j=0;j<m;j++)
            {
                if(rows[i]==1 || col[j]==1)
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