import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
       try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           System.out.printf("%064x\n", new BigInteger(1,MessageDigest.getInstance("SHA-256").digest(br.readLine().getBytes())));
                             } 
                             catch (NoSuchAlgorithmException | IOException e) {}
    }
}