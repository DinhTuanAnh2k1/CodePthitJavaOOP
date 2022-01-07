/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhngayhethanbaohanh;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Mian {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        ArrayList<SanPham> dssp = new ArrayList<>();
        ArrayList<KhachHang>dskh = new ArrayList<>();
        Scanner in = new Scanner(new File("MUAHANG.in"));
        int t1 = Integer.parseInt(in.nextLine());
        while(t1-->0){
            SanPham q = new SanPham(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            dssp.add(q);
        }
        int t2 = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t2; i++){
            KhachHang q = new KhachHang(i,in.nextLine(),in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),in.nextLine());
            dskh.add(q);
        }
        ArrayList<SapXep> dssx = new ArrayList<>();
        for(int i=0; i<dskh.size();i++){
            for(int j=0;j<dssp.size();j++){
                if(dskh.get(i).getMasp().equals(dssp.get(j).getMa())){
                    int tien = dskh.get(i).getSoluong()*dssp.get(j).getGia();
                    
                }
            }
        }
        
    }
}
