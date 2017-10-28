import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = sc.nextInt();
        String  max, min ;
        /*max = string[0];
        min = string[0]; */
        max = s.substring(0,0+i);
        min = s.substring(0,0+i);
        //String string []  = new String [] ;
        for(int k = 1;k<(s.length()-i + 1);k++)
         { //  string [k] = s.substring(k,k+i);
          if(max.compareTo(s.substring(k,k+i)) < 0 )
                max =  s.substring(k,k+i);
            if(min.compareTo(s.substring(k,k+i)) > 0)
                min = s.substring(k,k+i);   
        }
      /*  for(int n = 1;n < string.length -1 ;n++)
         {   
            if(max.compareTo(string[n]) < 0 )
                max =  string [n];
            if(min.compareTo(string[n]) > 0)
                min = string[n];
        }*/
        
        System.out.println(min + "\n" + max);
    }
}