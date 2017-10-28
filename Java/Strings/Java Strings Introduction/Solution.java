import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String str = A.concat(B);
        System.out.println(str.length());
        if(A.compareTo(B) > 0){
        //if(A.equals(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
         System.out.println(("" + A.charAt(0)).toUpperCase() + A.substring(1) + (" " + B.charAt(0)).toUpperCase() + B.substring(1) );
        
    }
}
