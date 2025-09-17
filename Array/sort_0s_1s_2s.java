import java.util.*;
public class sort_0s_1s_2s
{
    static void sort012(int[] arr) 
    {
        int c0=0,c1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            c0++;
            else if(arr[i]==1)
            c1++;
        }
        for(int i=0;i<c0;i++)
        arr[i]=0;
        for(int i=c0;i<c0+c1;i++)
        arr[i]=1;
        for(int i=c0+c1;i<arr.length;i++)
        arr[i]=2;

        System.out.println("The sorted array is : ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+ " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

        sort012(arr);

        sc.close();
    }
}