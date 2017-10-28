import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max =0;
        while(t>0)
            {
            max =0;
            int N = sc.nextInt();
            int K = sc.nextInt();
            for(int i=1;i<=N-1;i++)
              {
              for(int j=i+1;j<=N;j++){
                  if(Math.min(K,i&j)<K)
                      max = Math.max(max, Math.min(K,i&j));
              }  
            }
            System.out.println(max);
        }
    }
}