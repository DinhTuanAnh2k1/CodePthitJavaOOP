/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<BaiTap> dsbt = new ArrayList<>();
    static ArrayList<Nhom> dsn = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("SINHVIEN.in")); 
        Scanner in2 = new Scanner(new File("BAITAP.in"));
        Scanner in3 = new Scanner(new File("NHOM.in"));
        int t1 = Integer.parseInt(in1.nextLine());
        while(t1-->0){
            SinhVien q = new SinhVien(in1.nextLine(), in1.nextLine(), in1.nextLine());
            dssv.add(q);
        }
        int t2 = Integer.parseInt(in2.nextLine());
        for(int i=1; i<=t2; i++){
            BaiTap q = new BaiTap(i,in2.nextLine());
            dsbt.add(q);
        }
        int t3 = Integer.parseInt(in3.nextLine());
        while(t3-->0){
            Nhom q = new Nhom(in3.nextLine());
            q.compareTo(q);
            dsn.add(q);
        }
        Collections.sort(dsn);
        for(int i=0; i<dsn.size(); i++){
            int thutu = dsn.get(i).getThutubaitap();
            String maSV = dsn.get(i).getMasv();
            System.out.print(maSV+" ");
            for(int j=0; j<dssv.size(); j++){
                if(maSV.equals(dssv.get(j).getMa())){
                    System.out.print(dssv.get(j).getHoten()+" "+dssv.get(j).getSdt()+" "+ thutu+" ");
                    for(int k = 0; k<dsbt.size(); k++){
                        if(thutu==dsbt.get(k).getMabaitap()){
                            System.out.println(dsbt.get(k).getBaitap());
                        }
                    }
                }
            }
        }
    }
}
