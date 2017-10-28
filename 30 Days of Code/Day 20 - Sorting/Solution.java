import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num [] = new int[n];
        int tally = 0;
        for(int i=0;i<n;i++)
            {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    int numberOfSwaps = 0;
    int temp=0;
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (num[j] > num[j + 1]) {
            temp = num[j];
            num[j] = num[j+1];
            num[j+1] = temp;
            numberOfSwaps++;
            tally++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
        }
    }
        System.out.println("Array is sorted in " + tally + " swaps.");
        System.out.println("First Element: " + num[0]);
        System.out.println("Last Element: " + num[n-1]);
        
    }
    
}