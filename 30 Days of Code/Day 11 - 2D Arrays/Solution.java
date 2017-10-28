import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<4;i++ ) {
            for(int j=0;j<4;j++)
            {
            for (int k=0;k<3;k++)
            {
                sum+= arr[i][j+k];
                sum+= arr[i+2][j+k];
            }
            sum += arr[i+1][j+1];
             if(max < sum)
                max = sum;
            sum =0;
            //System.out.println(sum);
    }
        
        }
        
        System.out.println(max);
}
}