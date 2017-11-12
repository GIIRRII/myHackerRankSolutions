import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        UserReader in = new UserReader();
        int n = in.nextInt();
        int[] ar = new int[n];
        IntStream.range(0,n).forEach(i->ar[i] = in.nextInt());
        double positiveInt =  Arrays.stream(ar).filter(e->e>0).count();
        double negativeInt =  Arrays.stream(ar).filter(e->e<0).count();
        double zeroInt =  Arrays.stream(ar).filter(e->e==0).count();
        
        System.out.printf("%.6f\n", positiveInt/n);
        System.out.printf("%.6f\n", negativeInt/n);
        System.out.printf("%.6f", zeroInt/n);
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