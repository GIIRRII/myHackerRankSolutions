import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
       // System.out.println(month + " " + day + " "+ year);
        String str  = day + "/" + month + "/" + year;
        SimpleDateFormat smp =  new SimpleDateFormat("dd/MM/yyyy");
        try{
            DateFormat smp2  =  new SimpleDateFormat("EEEE");
            
           String Day =   smp2.format(smp.parse(str));
            System.out.println(Day.toUpperCase());
        } catch(Exception e){}
        
    }
}
