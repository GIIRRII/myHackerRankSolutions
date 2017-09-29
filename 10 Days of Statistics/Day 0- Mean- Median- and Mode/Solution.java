import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int number [] = new int [n];
        for(int i=0;i<n;i++)
            number[i] = sc.nextInt();
        double mean, median;
        int mode =0;
        for(int i : number)
            sum+=i;
        mean = (double)sum/n;
        Arrays.sort(number);
        
        if(n%2==0)
          {
          median = (number[n/2-1] + number [n/2])/2.0 ;
        }else
            median = number[n/2]/2.0;
        
        HashMap<Integer, Integer> hm  =  new HashMap<>();
        int occurance=0, maxOccurance = 0;
        for(int num :number)
        {
        
            if(hm.containsKey(num))
                {
                occurance = hm.get(num)+1;
            }else
                occurance = 1;
            hm.put(num, occurance);
            
            if(occurance>maxOccurance)
              {
                mode = num;
                maxOccurance = occurance;
            }else if(occurance== maxOccurance && mode > num)
                {
                mode = num;
            }
        }
        System.out.println(mean); 
         System.out.println(median); 
         System.out.println(mode); 

            
    }
}
