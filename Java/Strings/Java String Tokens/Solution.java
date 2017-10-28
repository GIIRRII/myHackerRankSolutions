import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            
        String str [] = s.trim().split("[\\s|!|,|.|'|\\?|_|@ ]+");
        //StringTokenizer token = new StringTokenizer(s, " !,'._@?");  
       // System.out.println(token.countTokens());
           
           
            System.out.println(str.length);
           for(String S : str)
        //while(token.hasMoreTokens())
           {
          //  System.out.println(token.nextToken());
               System.out.println(S);
        }
           }
        scan.close();
    }
}


