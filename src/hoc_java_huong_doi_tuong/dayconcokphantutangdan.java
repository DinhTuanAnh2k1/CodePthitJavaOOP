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
public class dayconcokphantutangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int ans[] = new int[n];
            for (int i = 1; i <= k; i++) {
                ans[i] = i;
                System.out.print(a[ans[i] - 1] + " ");
            }
            System.out.println();
            while (true) {
                int i = k;
                while (i > 0 && ans[i] == n - k + i)
                    i--;
                if (i == 0)
                    break;
                ans[i]++;
                for (int j = i + 1; j <= k; j++)
                    ans[j] = ans[j - 1] + 1;
                for (int j = 1; j <= k; j++)
                    System.out.print(a[ans[j] - 1] + " ");
                System.out.println();
            }
        }
    }
}
