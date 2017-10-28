import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        //Locale locale = new Locale("Rs")
        NumberFormat cf_us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cf_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat cf_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat cf_india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        
        String us = cf_us.format(payment);
        String china = cf_china.format(payment);
        String france = cf_france.format(payment);
        String india = cf_india.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
