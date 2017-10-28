import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0, max = -63;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                 sum = 0;
                for(int k=j;k<j+3;k++)
                    {
                    sum+=arr[i][k]+arr[i+2][k];
                }
                sum+=arr[i+1][j+1];
                max = Math.max(max,sum);
    }
}
        System.out.println(max);
    }
}