import java.util.Scanner;
import java.math.BigInteger;

/*

Use isProbablePrime() with certainty = 10 to achieve 99.9% accuracy. 
However, even certainty = 1 (which achieves 50% accuracy) is enough to 
pass the HackerRank test cases.

isProbablePrime() is always 100% certain if it tells you if a number 
is "not prime". If it says "prime", it's only 99.9% certain. It may be 
the case that it just hasn't found a prime number number that divides 
the BigInteger yet.

*/
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if(n.isProbablePrime(1))
            System.out.println("prime");
        else
           System.out.println("not prime");
    }
}
