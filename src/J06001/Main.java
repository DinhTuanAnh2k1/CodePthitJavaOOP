/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SanPham> dssp = new ArrayList<>();
        ArrayList<HoaDon> dshd = new ArrayList<>();
        int t1 = Integer.parseInt(in.nextLine());
        while(t1-->0){
            SanPham q = new SanPham(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            dssp.add(q);
        }
        int t2 = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t2;i++){
            HoaDon q = new HoaDon(i,in.nextLine());
            dshd.add(q);
        }
        for(int i=0; i<dshd.size(); i++){
            System.out.print(dshd.get(i).getMahoadon()+" ");
            String maHD = dshd.get(i).getMa();
            int loai = dshd.get(i).getLoai();
            for(int j = 0; j<dssp.size(); j++){
                if(dssp.get(j).getMa().equals(maHD)){
                    System.out.print(dssp.get(j).getTensp()+" ");
                    if(loai==1){
                        int tong = dshd.get(i).getSoluong() * dssp.get(j).getGialoai1();
                        float giamgia = tong / (float)100 * dshd.get(i).getHesogiam();
                        float giatra = tong - giamgia;
                        System.out.printf("%.0f %.0f",giamgia,giatra);
                    }
                    if(loai==2){
                        int tong = dshd.get(i).getSoluong() * dssp.get(j).getGialoai2();
                        float giamgia = tong / (float)100 * dshd.get(i).getHesogiam();
                        float giatra = tong - giamgia;
                        System.out.printf("%.0f %.0f",giamgia,giatra);
                    }
                }
            }System.out.println("");
        }
    }
}
