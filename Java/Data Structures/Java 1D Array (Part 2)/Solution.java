import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        boolean flag = false;
        int arr [] ;
       while(T-- > 0)
           {
           int n = sc.nextInt();
           int m = sc.nextInt();
           arr  = new int[n];
           for(int i=0;i<n;i++)
           {
             arr[i] = sc.nextInt();
           }
           
           if(solvable( arr, m, 0))
               System.out.println("YES");
           else
               System.out.println("NO");
       }
    }
    private static boolean solvable(int arr [], int m, int i){
        if (i < 0 || arr[i] == 1) {
        return false;
    } else if (i + 1 >= arr.length || i + m >= arr.length) {
        return true;
    }
        
    arr[i] = 1; // marks as visited

    /* Recursive Cases */
    return solvable(arr, m, i - 1) || 
           solvable(arr, m, i + 1) || 
           solvable(arr, m, i + m);
        
    }
}