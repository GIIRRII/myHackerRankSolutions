import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        
        try{
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =0;
            c =a/b;
            System.out.println(c);
            
        }
        catch(InputMismatchException e)
            {
            System.out.println(e.getClass().getName());
        }
        catch(Exception e)
            {
            System.out.println(e);
        }
    }
}