import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = "";
        while(t-->0)
            {
            str = sc.next();
            String s_even = "";
            String s_odd = "";
            for(int i=0;i<str.length();)
                {
                s_even += ""+str.substring(i,i+1);
                i+=2;
            }
            for(int i=1;i<str.length();)
                {
                s_odd += ""+str.substring(i,i+1);
                i+=2;
            }
            System.out.println(s_even+ " "+ s_odd);
        }
    }
}