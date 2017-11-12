import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        UserReader in = new UserReader();
        int n = in.nextInt();
        String sb = new String();
        for(int i=1;i<=n;i++){
            sb="";
            for(int j=0;j<n-i;j++){
                sb +=" "; 
            }
            for(int k=n-i;k<n;k++){
                sb +="#";
            }
            
            System.out.println(sb);
        }
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