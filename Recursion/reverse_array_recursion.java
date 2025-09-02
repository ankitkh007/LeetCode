import java.util.*;
public class reverse_array_recursion 
{
    static void reverse(int arr[], int l, int h)
    {
        if(l>=h)
        return;
        int t=arr[l];
        arr[l]=arr[h];
        arr[h]=t;
        reverse(arr,l+1,h-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        reverse(arr,0,n-1);
        System.out.println("The reversed array is:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
