/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036_bangdiemtheolop;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        ArrayList<BangDiem> dsbd = new ArrayList<>();
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            SinhVien q = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            dssv.add(q);
        }
        Scanner in1 = new Scanner(new File("MONHOC.in"));
        t = Integer.parseInt(in1.nextLine());
        while(t-->0){
            MonHoc q = new MonHoc(in1.nextLine(),in1.nextLine(), in1.nextLine());
            dsmh.add(q);
        }
        Scanner in2 = new Scanner(new File("BANGDIEM.in"));
        t= Integer.parseInt(in2.nextLine());
        while(t-->0){
            BangDiem q = new BangDiem(in2.next(),in2.next(),in2.nextLine());
            dsbd.add(q);
        }
        Collections.sort(dsbd);
        ArrayList<DanhSach> ds = new ArrayList<>();
        for(int i=0; i<dsbd.size();i++){
            for(int j=0;j<dssv.size();j++){
                if(dsbd.get(i).getMasv().equals(dssv.get(j).getMasv())){
                    for(int k=0;k<dsmh.size();k++){
                        if(dsbd.get(i).getMamon().equals(dsmh.get(k).getMamon())){
                            String tt = dssv.get(j)+" "+dsmh.get(k)+" "+dsbd.get(i);
                            String l = dssv.get(j).getLop();
                            DanhSach m = new DanhSach(tt,l);
                            ds.add(m);
                        }
                    }
                }
            }
        }
        Scanner in3 = new Scanner(System.in);
        int t1 = Integer.parseInt(in3.nextLine());
        while(t1-->0){
            String s = in3.nextLine();
            System.out.println("BANG DIEM lop "+s+":");
            for(int i=0; i<ds.size();i++){
                if(s.equals(ds.get(i).getLop())){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
}
