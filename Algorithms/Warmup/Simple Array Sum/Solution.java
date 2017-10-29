import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];        
        IntStream.range(0,n).forEach(i->ar[i]=in.nextInt());
        int result = Arrays.stream(ar).sum();
        System.out.println(result);
    }
}
