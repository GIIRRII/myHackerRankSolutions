import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
       int max = Arrays.stream(ar).max().getAsInt();
        return (int) Arrays.stream(ar).filter(e->e==max).count();
    }

    public static void main(String[] args) {
        UserReader in = new UserReader();
        int n = in.nextInt();
        int[] ar = new int[n];
        IntStream.range(0,n).forEach(i->ar[i] = in.nextInt());
        
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}


class UserReader {
    BufferedReader br;
    StringTokenizer st;
    public UserReader(){
        br= new BufferedReader(new InputStreamReader(System.in));
        
    }
    public String next(){
        while(st==null||!st.hasMoreElements()){
            try{
                st = new StringTokenizer(br.readLine());
            }catch(Exception e){
                e.printStackTrace();
            }    
        }
        return st.nextToken();
      }
   
   public int nextInt(){
       return Integer.parseInt(next());
       
   }
    
   public long nextLong(){
       return Long.parseLong(next());
       
   }
    
   public double nextDouble(){
       return Double.parseDouble(next());
   }
    
   public String nextLine(){
       String str ="";
       try{
           str = br.readLine();
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return str;
   }
}

