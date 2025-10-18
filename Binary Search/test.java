import java.util.*;
public class test
{
    static void findMean(int arr[], int n)
    {
        double sum=0.0, sum2=0.0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The mean of the given data is: "+(sum/n)); //mean printed

        for(int i=0;i<n;i++)
        {
            sum2=sum2+Math.abs(arr[i]-(sum/n));
        }

        System.out.println("The mean devaiation of the given data is: "+(sum2/n)); //mean printed

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        findMean(arr,n);
        sc.close();
    }
}