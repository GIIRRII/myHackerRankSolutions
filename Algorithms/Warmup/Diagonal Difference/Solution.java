import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        UserReader in = new UserReader();
        int n = in.nextInt();
        int[][] ar = new int[n][n];
        IntStream.range(0, n).forEach(i->IntStream.range(0,n).forEach(j->ar[i][j] = in.nextInt()));
        int sum[] = new int[]{0,0};
        IntStream.range(0,n).forEach(i->IntStream.range(0,n).forEach(j->{ 
            if(i==j){
                sum[0]+=ar[i][j];
            }
           if(i+j==(n-1))
                sum[1]+=ar[i][j];
        }));
         
        System.out.println(Math.abs(sum[0]-sum[1]));
        }
}
class UserReader{
    BufferedReader br;
    StringTokenizer st;
    public UserReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next(){
        while(st==null||!st.hasMoreElements()){
            try{
            st = new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                    e.printStackTrace();
            }
            
        }
      return st.nextToken();  
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str = "";
            try{
                str = br.readLine();
                
            }catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
    }
    
}