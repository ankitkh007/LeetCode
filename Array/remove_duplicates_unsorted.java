import java.util.*;

public class remove_duplicates_unsorted {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
        arr.add(sc.nextInt());
        
        Set<Integer> set = new LinkedHashSet<>(arr);
        
        System.out.println("The array after removing duplicates is : ");
        for (int x : set)
        System.out.print(x + " ");

        sc.close();
    }
}
