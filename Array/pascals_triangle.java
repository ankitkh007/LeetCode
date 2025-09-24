import java.util.*;
public class pascals_triangle
{
    /*public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result= new ArrayList<>();
        if(numRows<1 || numRows>30)
        return result;

        //First row
        result.add(new ArrayList<>());
        result.get(0).add(1);

        //2nd row onwards
        for(int i=1;i<numRows;i++)
        {
            //List<Integer> prevRow = result.get(i-1); //get previous row
            List<Integer> newRow=new ArrayList<>(); //make new row

            newRow.add(1); //first element is always 1
            for(int j=1;j<i;j++)
            {
                newRow.add(result.get(i-1).get(j-1)+ result.get(i-1).get(j)); //middle elements
            }
            newRow.add(1); //last element is always 1

            result.add(newRow);
        }
        return result;
    }*/
    
    //Generates each Pascal's row in TC-->O(n)
    static List<Integer> generatePascalsRow(int n)
    {
        List<Integer> row=new ArrayList<>();
        int ans=1;
        row.add(ans);
        for(int i=1;i<n;i++)
        {
            ans=ans*(n-i)/i;
            row.add(ans);
        }
        return row;
    }
    //Merges all generated rows into final Pascal's list
    static List<List<Integer>> pascals_list(int rows)
    {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=rows;i++)
        {
            ans.add(generatePascalsRow(i));
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Traiangle : ");   
        int numRows=sc.nextInt();
        System.out.println("Output : "+ pascals_list(numRows));
        sc.close();
    }
}