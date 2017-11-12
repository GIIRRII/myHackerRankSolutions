import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long arr[] = new long[n+1];
        int a=0, b=0,k=0;
        long max=0,sum=0;
        for(int i=0; i<m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();
            
                arr[a-1] +=k;
                arr[b] -=k;
            }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            max = Math.max(max, sum);
        }
        
      System.out.println(max);      
    }
}