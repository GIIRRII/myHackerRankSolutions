import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x[] = new int [n];
        int w[] = new int [n];
        int sum  = 0;
        int w_sum = 0;
        double mean=0;
        for(int i = 0; i<n; i++)
            x[i] = sc.nextInt();
       
        for(int i = 0; i<n; i++)
            w[i] = sc.nextInt();
        
        for(int i=0;i<n;i++)
            {
            sum+=x[i]*w[i];
            w_sum += w[i];
        }
        mean = (double)sum/w_sum;
        mean = (double)sum/w_sum;
        System.out.format("%.1f" , mean);
        
        
    }
}
