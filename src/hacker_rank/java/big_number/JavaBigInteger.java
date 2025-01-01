package hacker_rank.java.big_number;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = new BigInteger(sc.nextLine());
        BigInteger n2 = new BigInteger(sc.nextLine());
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
