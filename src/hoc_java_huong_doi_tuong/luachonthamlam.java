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
public class luachonthamlam {
    public static void main(String[] args) {
        int m = sc.nextInt(), s = sc.nextInt();
        findSmallest(m, s);
    }
        public static Scanner sc = new Scanner(System.in);

    static void findSmallest(int m, int s) {
        int check = s;
        if (s == 0 || s > 9 * m) {
            System.out.print("-1 -1");
            return;
        }
        int[] res = new int[m];
        s -= 1;
        for (int i = m - 1; i > 0; i--) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }
        res[0] = s + 1;
        for (int i = 0; i < m; i++)
            System.out.print(res[i]);
        System.out.print(" ");
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            if (check > 9) {
                ans[i] = 9;
                check -= 9;
            } else {
                ans[i] = check;
                check = 0;
            }
        }
        for (int i = 0; i < m; i++)
            System.out.print(ans[i]);
    }
}
