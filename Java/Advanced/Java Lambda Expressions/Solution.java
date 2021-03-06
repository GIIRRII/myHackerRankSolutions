import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd( ){
  return (int a)->{
      //if(a%2==0)
      //return true;
      return ((a&1)==1);
  };
}

public static PerformOperation isPrime( ){
    return (int a)->{   if(a == 2) return true;
                        if(a  < 2) return false;
                        if(a%2 == 0) return false;
                        for(int i = 3; i*i<a;i=i+2)
                        {
                            if(a%i==0)
                                return false;
                        }
                     return true;
            
    };
    
}

public static PerformOperation isPalindrome( ){
   return  (int a) -> {
       String str = Integer.toString(a);
       String str2 = "";
       int i = 0;
       int j = str.length() - 1;
       for ( ; i <= j; ++i, --j) {
           if (str.charAt(i) != str.charAt(j)) return false; 
       }
       return true;
    }; 
}
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.is_odd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.is_prime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.is_palindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
