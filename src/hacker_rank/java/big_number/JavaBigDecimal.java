package hacker_rank.java.big_number;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        String[] sCopy = new String[n];
        System.arraycopy(s, 0, sCopy, 0, n);
        BigDecimal iElement, jElement;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                iElement = new BigDecimal(s[i]);
                jElement = new BigDecimal(s[j]);
                if (iElement.compareTo(jElement) < 0)
                    swapElements(s, i, j);
                else if (iElement.compareTo(jElement) == 0 && shouldSwapIdenticalItems(n, sCopy, s[i], s[j]))
                    swapElements(s, i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    private static boolean shouldSwapIdenticalItems(int n, String[] sCopy, String iElement, String jElement) {
        for (int k = 0; k < n; k++) {
            if (sCopy[k].equals(iElement))
                return false;
            if (sCopy[k].equals(jElement))
                return true;
        }
        return false;
    }

    private static void swapElements(String[] s, int i, int j) {
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
