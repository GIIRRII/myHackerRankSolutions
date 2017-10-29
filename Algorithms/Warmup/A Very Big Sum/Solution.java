import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        IntStream.range(0,n).forEach(i->ar[i]=in.nextLong());
        System.out.println(Arrays.stream(ar).sum());
        
    }
}
