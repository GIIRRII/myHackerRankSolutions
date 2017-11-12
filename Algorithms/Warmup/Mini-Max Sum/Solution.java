import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        UserReader in = new UserReader();
        /*long[] arr = new long[5];
        IntStream.range(0,5).forEach(i->arr[i] = in.nextLong());
        long sum = Arrays.stream(arr).sum();
        long min = Arrays.stream(arr).min().getAsLong();
        long max = Arrays.stream(arr).max().getAsLong();
        */
        long sum, min, max;
        sum = min = max = in.nextLong();
        for(int i=1;i<5;i++){
            long tmp = in.nextLong();
            sum+=tmp;
            if(max > tmp){
                if(min > tmp){
                    min = tmp;
                }
            }else{
                max = tmp;
            }
        }
        System.out.println((sum-max) + " " + (sum-min));
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
