import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList <Integer> list =  new ArrayList<Integer>();
        for(int i=0;i<N;i++)
            {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        String q1 ;
        int x =0 , y = 0;
        //String q2 ;
        while(q-- > 0){
            q1 = sc.next();
            if("Insert".equalsIgnoreCase(q1))
            {
                x = sc.nextInt();
                y = sc.nextInt();
                list.add(x, y);
                
            }else if("Delete".equalsIgnoreCase(q1))
                {
                x = sc.nextInt();
                list.remove(x);
            }
        }
        
        for(int l : list){
            System.out.print(l + " ");
        }
    }
}
