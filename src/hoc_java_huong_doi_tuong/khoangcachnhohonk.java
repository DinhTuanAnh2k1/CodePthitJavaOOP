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
public class khoangcachnhohonk {
     public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            Arrays.sort(a);
            long res = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                while (j < n && a[j] - a[i] < k) {
                    j++;
                }
                res += j - i - 1;
            }
            System.out.println(res);
        }
    }
}

