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
       int Q1, Q2, Q3 ;
        for(int i=0;i<n;i++)
            {
            num[i] = sc.nextInt();
        }
        
        Arrays.sort(num);
        
        Q2 = quertile(num,0, n);
        Q1 = quertile(num,0, n/2);
        if(n%2==0)
           Q3 = quertile(num, n/2, n);
        else
            Q3 = quertile(num,((n+1)/2), n);
        
        System.out.println(Q1+"\n" + Q2+ "\n" + Q3);
            
    }
    public static int quertile(int num [] , int start , int end )
        { int n =  end - start ;
        if(n%2==0)
            {
            return Math.round((num[start + n/2-1] + num[start + n/2])/2);
        }else
            return num[start + n/2];
    }
}
