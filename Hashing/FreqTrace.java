import java.util.*;

public class FreqTrace 
{
    public static void main(String[] args) {
        int[] arr = {5,2,5,3,1,5,2};
        Map<Integer, Integer> freq = new HashMap<>();

        System.out.println("Starting with empty map: " + freq);

        for (int x : arr) {
            System.out.println("\nProcessing element: " + x);

            // merge ka use
            freq.merge(x, 1, Integer::sum);

            // step-by-step map state
            System.out.println("Map after inserting " + x + ": " + freq);
        }

        // Final frequency print with entrySet
        System.out.println("\n--- Final Frequencies ---");
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println("value " + e.getKey() + " occurs " + e.getValue() + " times");
        }
    }
}