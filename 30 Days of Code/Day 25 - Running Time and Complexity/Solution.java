import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean flag = true;
        
        while(T-->0)
            {
            flag =true;
            int n = sc.nextInt();
            if(n==2)
              {
                flag = true;}
            else if(n==1||(n&1)==0)
                flag=false;
                
             // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                flag= false;
            }
        }
            
            
          if(flag)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}