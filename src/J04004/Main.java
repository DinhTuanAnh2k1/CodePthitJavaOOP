/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04004;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo p = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo q = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo t = p.cong(q);
        t.rutGon();
        System.out.println(t);
    }
}
