import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int dd_a = sc.nextInt();
        int mm_a = sc.nextInt();
        int yy_a = sc.nextInt();
        int dd_e = sc.nextInt();
        int mm_e = sc.nextInt();
        int yy_e = sc.nextInt();
        int fine =0;
        
        
        if(yy_a-yy_e < 0)
            fine =0;
        else
            if(yy_a-yy_e==0)
                if(mm_a-mm_e < 0)
                       fine = 0;
                else
                    if(mm_a-mm_e == 0)
                        if(dd_e >=dd_a)
                            fine = 0;
                        else
                            fine = 15*(dd_a-dd_e);
                    else
                            fine = 500*(mm_a-mm_e);
        else
                fine = 10000;
        
            System.out.println(fine);
    }
}