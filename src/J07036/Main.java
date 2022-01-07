/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        ArrayList<MonHoc> dsMonHoc = new ArrayList<>();
        ArrayList<BangDiem> dsbangDiem = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsSinhVien.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsMonHoc.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            BangDiem p = new BangDiem(sc.next(), sc.next(), sc.nextDouble());
            for (MonHoc x : dsMonHoc)
                if (x.getMa().equals(p.getmMH()))
                    p.setM(x);
            for (SinhVien x : dsSinhVien)
                if (x.getMa().equals(p.getMsv()))
                    p.setS(x);
            dsbangDiem.add(p);
        }
        Collections.sort(dsbangDiem, new Comparator<BangDiem>() {
            public int compare(BangDiem a, BangDiem b) {
                if (a.getMaMH().compareTo(b.getMaMH()) < 0)
                    return -1;
                else if (a.getMaMH().equals((b.getMaMH())) && a.getMsv().compareTo(b.getMsv()) < 0)
                    return -1;
                return 1;
            }
        });
        sc.nextLine();
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            for (BangDiem x : dsbangDiem) {
                if (s.equals(x.getLopSv())) {
                    System.out.println("BANG DIEM lop " + s + ":");
                    break;
                }
            }
            for (BangDiem x : dsbangDiem) {
                if (s.equals(x.getLopSv())) {
                    System.out.println(x);
                }
            }
        }
    }
}
