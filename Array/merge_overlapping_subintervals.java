import java.util.*;
public class merge_overlapping_subintervals 
{
    static int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        List<int[]> ans=new ArrayList<>();
        int prev[]=intervals[0]; //sets the first subinterval as previous  

        for(int i=1;i<intervals.length;i++) //starts the iteration from tghe 2nd subinterval onwards
        {
            if(intervals[i][0]<=prev[1]) //if current sub-interval's 1st element <= previous sub-interval's last element
            prev[1]=Math.max(prev[1], intervals[i][1]); //update the previous sub-interval
            else 
            {
                ans.add(prev); //adds updated interval
                prev=intervals[i]; //if not; set current interval as previous itnerval
            }
        }
        ans.add(prev); //add last intervals
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of subintervals : ");
        int n = sc.nextInt();
        System.out.println("Enter the subintervals : ");
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<2;j++)
            arr[i][j]=sc.nextInt();
        }
        System.out.println("The merged sub-ingtervals are : "+ Arrays.deepToString(merge(arr)));
        sc.close();
    }    
}