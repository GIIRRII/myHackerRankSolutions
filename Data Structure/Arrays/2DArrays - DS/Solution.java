import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum =0, max=-63;
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=0;
                for(int k=j;k<=j+2;k++)
                    sum+=arr[i][k];
                for(int k=j;k<=j+2;k++)
                    sum +=arr[i+2][k];
                    sum +=arr[i+1][j+1];
                if(max<sum)
                    max=sum;
            }
        }
        System.out.println(max);
    }
}