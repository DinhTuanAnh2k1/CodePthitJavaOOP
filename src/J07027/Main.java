/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<SinhVien> dSinhVien = new ArrayList<>();
        ArrayList<BaiTap> dsBaiTap = new ArrayList<>();
        ArrayList<Nhom> dsNhom = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dSinhVien.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("BAITAP.in"));
        t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            dsBaiTap.add(new BaiTap(i, sc.nextLine()));
        }
        sc = new Scanner(new File("NHOM.in"));
        while (sc.hasNext()) {
            Nhom p = new Nhom(sc.next(), Integer.parseInt(sc.next()));
            for (SinhVien x : dSinhVien)
                if (p.getMsv().equals(x.getMa()))
                    p.setS(x);
            for (BaiTap x : dsBaiTap)
                if (p.getId() == x.getId())
                    p.setB(x);
            dsNhom.add(p);
        }
        Collections.sort(dsNhom, new Comparator<Nhom>() {
            public int compare(Nhom a, Nhom b) {
                return (a.getMsv().compareTo(b.getMsv()) < 0) ? -1 : 1;
            }
        });
        for (Nhom x : dsNhom)
            System.out.println(x);
    }
}
