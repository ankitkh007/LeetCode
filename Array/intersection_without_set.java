import java.util.*;
public class intersection_without_set 
{
    static boolean isPresent(int test[], int size, int key) //checks whether the element is already present in the array or not
    {
        for(int i=0;i<size;i++)
        {
            if(test[i]==key)
            return true;
        }
        return false;
    }
    static void intersection(int arr1[],int arr2[], int n1, int n2)
    {
        int result[]=new int[Math.min(n1, n2)];
        int size=0;

        //Add all elements from array 1
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    if(!isPresent(result, size, arr1[i]))
                    {
                        result[size++]=arr1[i];
                    }
                }
            }
        }

        System.out.println("The Intersection of two arrays is : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array 1 : ");
        int n1 = sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter " + n1 + " elements : ");
        for (int i = 0; i < n1; i++)
        arr1[i]=sc.nextInt();

        System.out.println("Enter the size of the array 2 : ");
        int n2 = sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter " + n2 + " elements : ");
        for (int i = 0; i < n2; i++)
        arr2[i]=sc.nextInt();
        
        intersection(arr1, arr2, n1, n2);
        sc.close();     
    }   
}