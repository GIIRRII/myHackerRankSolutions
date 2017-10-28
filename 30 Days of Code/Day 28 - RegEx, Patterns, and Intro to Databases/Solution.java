import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String pattern = "([a-z]+)//s";
            //[a-zA-Z]+@gmail.com";
        Pattern p = Pattern.compile(pattern);
        while(n > 0)
        {
        String s = sc.nextLine().trim();
        //System.out.println(s);
        //System.out.println(p);
        Matcher m = p.matcher(s);
        if(m.find())
            {
            System.out.println(m.group(0));
        }
            n--;
        }*/
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> names = new LinkedList<String>();
        Pattern p = Pattern.compile("(\\w@gmail.com)");
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for(String item : names) {
            System.out.println(item);
        }
    }
}