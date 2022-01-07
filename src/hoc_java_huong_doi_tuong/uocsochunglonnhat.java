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
public class uocsochunglonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.printf(arr[0] + " ");
            for (int i = 0; i < n - 1; i++)
                System.out.printf((arr[i] * arr[i + 1]) / gcd(arr[i], arr[i + 1]) + " ");
            System.out.println(arr[n - 1]);
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
