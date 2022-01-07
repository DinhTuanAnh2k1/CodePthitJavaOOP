/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020_hoadon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.text.*;
/**
 *
 * @author Admin
 */
public class Main {
   static ArrayList<KhachHang> dskh = new ArrayList<>(); 
   static ArrayList<MatHang> dsmh = new ArrayList<>();
   static ArrayList<HoaDon> dshd = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in1 = new Scanner(new File("KH.in"));
        Scanner in2 = new Scanner(new File("MH.in"));
        Scanner in3 = new Scanner(new File("HD.in"));
        int t1 = Integer.parseInt(in1.nextLine());
        for(int i=1; i<=t1; i++){
            KhachHang q = new KhachHang(i,in1.nextLine(),in1.nextLine(),in1.nextLine(),in1.nextLine());
            dskh.add(q);
        }
        int t2 = Integer.parseInt(in2.nextLine());
        for(int i=1; i<=t2; i++){
            MatHang q = new MatHang(i,in2.nextLine(),in2.nextLine(),Integer.parseInt(in2.nextLine()), Integer.parseInt(in2.nextLine()));
            dsmh.add(q);
        }
        int t3 = Integer.parseInt(in3.nextLine());
        for(int i=1; i<=t3; i++){
            HoaDon q = new HoaDon(i,in3.nextLine());
            dshd.add(q);
        }
        for(int i=0; i<dshd.size(); i++){
            System.out.print(dshd.get(i).getMaHD()+" ");
            String khachhang = dshd.get(i).getNguoimua();
            String mathang = dshd.get(i).getSanpham();
            int soluong = dshd.get(i).getSoluong();
            for(int j=0; j<dskh.size(); j++){
                if(khachhang.equals(dskh.get(j).getMaKH())){
                    System.out.print(dskh.get(j).getTen()+" "+ dskh.get(j).getDiachi()+" ");
                }
            }
            for(int j=0; j<dsmh.size(); j++){
                if(mathang.equals(dsmh.get(j).getMaMH())){
                    long tien = soluong * dsmh.get(j).getGiaban();
                    System.out.println(dsmh.get(j).getTen()+" "+ dsmh.get(j).getDonvi()+" "+dsmh.get(j).getGiamua()+" "+dsmh.get(j).getGiaban()+" "+soluong+" "+tien); 
                }
            }
        }
    }
}
