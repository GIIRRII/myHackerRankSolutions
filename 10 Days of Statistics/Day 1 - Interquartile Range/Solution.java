import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int num [] = new int [n];
        int f []  = new int [n];
        int f_sum =0; 
        double Q1, Q2, Q3 ;
        
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();
        
        for(int i=0;i<n;i++){
            f[i] = sc.nextInt();
            f_sum += f[i];
        }
        
        int set [] = new int [f_sum];
        int k=0;
        for(int i=0;i< n;i++)
         {
            for(int j=0;j<f[i];j++)
               {
                set[k] = num[i];
                k++;
                
             }
                
        }
        
        
        Arrays.sort(set);
        
        Q2 = quertile(set,0, f_sum);
        Q1 = quertile(set,0, f_sum/2);
        if(n%2==0)
           Q3 = quertile(set, f_sum/2, f_sum);
        else
            Q3 = quertile(set,( (f_sum+1)/2), f_sum);
        
        System.out.println(Q3 - Q1);
            
    }
    public static double quertile(int num [] , int start , int end )
        { int n =  end - start ;
        if(n%2==0)
            {
            return ((double)num[start + n/2-1] + (double)num[start + n/2])/2.0;
        }else
            return (double)num[start + n/2];
    }
       
    
}
