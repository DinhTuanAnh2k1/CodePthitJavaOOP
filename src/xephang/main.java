/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xephang;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<xep_hang> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            xep_hang a = new xep_hang(in.nextLong(), in.nextLong());
            ds.add(a);
        }
        Collections.sort(ds, xep_hang::CompareTo);
        long ans = 0;
        for (xep_hang x : ds) {
            ans = Math.max(ans, x.T) + x.D;
        }
        System.out.println(ans);
    }
}
