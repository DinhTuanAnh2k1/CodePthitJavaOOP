/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc_java_huong_doi_tuong;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class dayconcotongle {
    public static void main(String[] args) {
               int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer a[] = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.fill(check, 0);
            Arrays.sort(a, Collections.reverseOrder());
            Try(0, a, n);
        }
    
    }
        public static Scanner sc = new Scanner(System.in);
    public static int[] check = new int[16];

    public static void Try(int i, Integer[] a, int n) {
        for (int j = 0; j <= 1; j++) {
            check[i] = j;
            if (i == n - 1) {
                int tong = 0;
                for (int k = 0; k < n; k++)
                    if (check[k] == 1)
                        tong += a[k];
                if (tong % 2 != 0) {
                    for (int k = 0; k < n; k++) {
                        if (check[k] == 1)
                            System.out.print(a[k] + " ");
                    }
                    System.out.println();
                }
            } else
                Try(i + 1, a, n);
        }
    }
}
