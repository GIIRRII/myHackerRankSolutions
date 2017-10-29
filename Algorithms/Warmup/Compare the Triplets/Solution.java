import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        IntStream.range(0,3).forEach(i->a[i]=in.nextInt());
        IntStream.range(0,3).forEach(i->b[i]=in.nextInt());
        
        int[] result = new int [2];
        IntStream.range(0,3).forEach(i->{
            if(a[i]>b[i]){result[0]+=1;}else if(b[i]>a[i]){ result[1]+=1;}
                                        });
       
        
        IntStream.range(0,result.length).forEach(i->System.out.print(result[i] + (i != result.length - 1 ? " " : "")));
        
        System.out.println("");
        

    }
}
