/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019_hoadon1;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA1.in"));
        ArrayList<SanPham> sp = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            SanPham q = new SanPham(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            sp.add(q);
        }
        Scanner in2 = new Scanner(new File("DATA2.in"));
        ArrayList<HoaDon> hd = new ArrayList<>();
        int k = Integer.parseInt(in2.nextLine());
        for(int i=1; i<=k; i++){
            HoaDon p = new HoaDon(i,in2.nextLine());
            hd.add(p);
        }
        for(int i=0; i<hd.size(); i++){
            System.out.print(hd.get(i).getMahoadon()+" ");
            String maHD = hd.get(i).getMa();
            int loai = hd.get(i).getLoai();
            for(int j = 0; j<sp.size(); j++){
                if(sp.get(j).getMa().equals(maHD)){
                    System.out.print(sp.get(j).getTensp()+" ");
                    if(loai==1){
                        int tong = hd.get(i).getSoluong() * sp.get(j).getGialoai1();
                        float giamgia = tong / (float)100 * hd.get(i).getHesogiam();
                        float giatra = tong - giamgia;
                        System.out.printf("%.0f %.0f",giamgia,giatra);
                    }
                    if(loai==2){
                        int tong = hd.get(i).getSoluong() * sp.get(j).getGialoai2();
                        float giamgia = tong / (float)100 * hd.get(i).getHesogiam();
                        float giatra = tong - giamgia;
                        System.out.printf("%.0f %.0f",giamgia,giatra);
                    }
                }
            }System.out.println("");
        }
    }
}
