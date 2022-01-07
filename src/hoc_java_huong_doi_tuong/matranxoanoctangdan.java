/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc_java_huong_doi_tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mr Hieu
 */
public class matranxoanoctangdan {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans[][] = new int[n][n];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr.add(sc.nextInt());
        Collections.sort(arr);
        int dong = n, cot = n, k = 0, p = 0;
        while (k < n * n) {
            for (int i = p; i < cot; i++)
                ans[p][i] = arr.get(k++);
            for (int i = p + 1; i < dong; i++)
                ans[i][cot - 1] = arr.get(k++);
            for (int i = cot - 2; i >= p; i--)
                ans[dong - 1][i] = arr.get(k++);
            for (int i = dong - 2; i > p; i--)
                ans[i][p] = arr.get(k++);
            p++;
            dong--;
            cot--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
}
