import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //Byte [] bytes = s.getBytes();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte [] digest = md.digest();
        for(byte b : digest)
            System.out.format("%02x",b);
    }
}