import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        BitSet [] bitset = new BitSet[3];
        bitset[1] = B1;
        bitset[2] = B2;
        Map<String, BiConsumer<Integer, Integer>> ops = new HashMap<>();
        ops.put("AND", (index1, index2) -> bitset[index1].and(bitset[index2]));
        ops.put("OR", (index1, index2) -> bitset[index1].or(bitset[index2]));
        ops.put("XOR", (index1, index2) -> bitset[index1].xor(bitset[index2]));
        ops.put("SET", (index1, index2) -> bitset[index1].set(index2));
        ops.put("FLIP", (index1, index2) -> bitset[index1].flip(index2));
        for (int i=0; i<M; i++) {
            /*String str = scan.next();
            int a      = scan.nextInt();
            int b      = scan.nextInt();*/
            ops.get(scan.next()).accept(scan.nextInt(),scan.nextInt());
            System.out.println(bitset[1].cardinality() + " " + bitset[2].cardinality());
        }
        scan.close();
    }
}