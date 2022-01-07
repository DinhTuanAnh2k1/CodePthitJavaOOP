/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc_java_huong_doi_tuong;

import java.util.Scanner;

/**
 *
 * @author Mr Hieu
 */

public class dayconlientieptongbangk {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n + 1];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            Boolean check = false;
            int j = 0, i = 1;
            long sum = a[0];
            while (i <= n) {
                if (sum < k || i == j)
                    sum += a[i++];
                else if (sum > k)
                    sum -= a[j++];
                else {
                    check = true;
                    break;
                }
            }
            System.out.println((check) ? "YES" : "NO");
        }
    }
}
