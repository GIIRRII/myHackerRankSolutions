import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      /* Scanner sc = new Scanner(System.in);
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            {
                int d = sc.nextInt();
                List<Integer> l = new ArrayList<Integer>();
                for(int j=0;j<d;j++){
                    l.add(sc.nextInt());
                    }
                list.add(l);
            }
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
            {
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> li = list.get(x-1);
            if(li.size()<y)
                System.out.println("ERROR!");
            else
                System.out.println(li.get(y-1));
        }*/
        Scanner sc = new Scanner(System.in);
          int numOfArray = sc.nextInt();
          int d = 0;
          ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
          for(int i = 0; i<numOfArray; i++){
              d = sc.nextInt();
              Integer[] arr = new Integer[d];
              for(int j =0; j<d; j++){
                  arr[j] = sc.nextInt();
              }
              arrayList.add(arr);
          }
          int q = 0; 
          q = sc.nextInt();
          for(int i = 0; i<q;  i++){
              int x = sc.nextInt();
              int y = sc.nextInt(); 
             try{
              System.out.println(arrayList.get(x-1)[y-1]);
              }catch(Exception e){System.out.println("ERROR!");};
             
          }
        
    }
}