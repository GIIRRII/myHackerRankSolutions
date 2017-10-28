import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++)
            {
            if(s.charAt(i)=='1')
                {    count++;
                     max = Math.max(count, max);
                }
             else
                count = 0;
                }
        
        System.out.println(max);
    }
}