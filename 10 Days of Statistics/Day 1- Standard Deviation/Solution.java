import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x_i[] =  new int[n];
        int sum=0;
        double mean = 0.0;
        double distance = 0.0;
        double sd = 0.0;
        
        
        for(int i=0;i<n;i++)
        {    x_i[i] = sc.nextInt();
             sum+=x_i[i];
        }
        mean = (double)sum/n;
        for(int i=0;i<n;i++)
          {
           distance+= Math.pow(mean - x_i[i], 2); 
        }
        sd = Math.sqrt(distance/n);
            System.out.format("%1f",sd);
        
    }
}
