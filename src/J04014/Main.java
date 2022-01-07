/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            PhanSo p = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo q = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo c = p.phanSoC(q);
            c.rutGon();
            PhanSo t = p.phanSoD(q);
            PhanSo d = t.phanSoD(c);
            d.rutGon();
            System.out.println(c + " " + d);
        }
    }
}
