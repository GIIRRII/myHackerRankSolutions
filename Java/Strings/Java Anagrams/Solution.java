//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.io.*;
import java.util.*;

public class Solution {

       static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();    
        char ch_a [] = a.toCharArray();
        char ch_b [] = b.toCharArray();
            Arrays.sort(ch_a);
            Arrays.sort(ch_b);
        a = new String(ch_a);
        b = new String(ch_b);
       /* a = "";
        b = "";
        for(char ch : ch_a)
            a += ch;
        for(char ch : ch_b)
            b += ch;
        */
           return a.equalsIgnoreCase(b); 
               //ch_a.toString().equalsIgnoreCase(ch_b.toString());
        
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
