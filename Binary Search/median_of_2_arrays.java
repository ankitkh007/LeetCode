import java.util.Scanner;
public class median_of_2_arrays
{
    static double median(int arr1[], int arr2[])
    {
        int n1=arr1.length, n2=arr2.length;
        int n=(n1+n2);
        int i=0,j=0;
        int ind2=n/2;
        int ind1=ind2-1;
        int ind1val=-1, ind2val=-1;
        int count=0;
        
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                if(count==ind1) ind1val=arr1[i];
                if(count==ind2) ind2val=arr1[i];
                count++;
                i++;
            }
            else
            {
                if(count==ind1) ind1val=arr2[j];
                if(count==ind2) ind2val=arr2[j];
                count++;
                j++;
            }
        }

        while(i<n1)
        {
            if(count==ind1) ind1val=arr1[i];
            if(count==ind2) ind2val=arr1[i];
            count++;
            i++;
        }
        while(j<n2)
        {
            if(count==ind1) ind1val=arr2[j];
            if(count==ind2) ind2val=arr2[j];
            count++;
            j++;
        }

        return ((ind1val+ind2val)/2.0);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];

        System.out.println("Enter "+n1+" elements:");
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter the size of array 2: ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];

        System.out.println("Enter "+n2+" elements:");
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
        
        System.out.println("The median of both the arrays is: "+median(arr1, arr2));

        sc.close();
    }
}