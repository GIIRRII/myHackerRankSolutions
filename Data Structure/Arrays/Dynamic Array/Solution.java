import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int Q = sc.nextInt();
      // int arr[][] = new int[N][];
        ArrayList<Integer>[] arr = new ArrayList[N]; 
       int ch=0,x=0,y=0;
       int lastAnswer=0;
      // int temp[];
       int c=0;
       while(Q-- > 0){
           ch= sc.nextInt();
           x = sc.nextInt();
           y = sc.nextInt();
           c = (x^lastAnswer)%N;
        switch(ch){  
            case 1: 
                
                if(arr[c]== null){
                    ArrayList<Integer> list = new ArrayList<>();
                list.add(y);
                arr[c] = list;}
                else
                    arr[c].add(y);
                break;
            case 2:
               System.out.println(lastAnswer = arr[c].get(y%arr[c].size()));
                break;
        }
       }
        
    }
}