/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006_quanlybanhang2;

/**
 *
 * @author Admin
 */
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<KhachHang> dskh = new ArrayList<>();
        ArrayList<MatHang> dsmh = new ArrayList<>();
        ArrayList<HoaDon> dshd = new ArrayList<>();
        int t1=Integer.parseInt(in.nextLine());
        for(int i=1; i<=t1; i++){
            KhachHang q = new KhachHang(i,in.nextLine(),in.nextLine()
            ,in.nextLine(),in.nextLine());
            dskh.add(q);
        }
        int t2 = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t2; i++){
            MatHang q = new MatHang(i,in.nextLine(),in.nextLine(),
            Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            dsmh.add(q);
        }
        int t3 = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t3; i++){
            HoaDon q = new HoaDon(i,in.nextLine());
            dshd.add(q);
        }
        ArrayList<SapXep> dssx = new ArrayList<>();
        for(int i=0; i<dshd.size(); i++){
            for(int j=0;j<dskh.size();j++){
                if(dshd.get(i).getMakh().equals(dskh.get(j).getMakh())){
                    for(int k=0;k<dsmh.size();k++){
                        if(dshd.get(i).getMamh().equals(dsmh.get(k).getMasp())){
                            int tienban = dshd.get(i).getSoluong()*dsmh.get(k).getGiaban();
                            int tienmua = dshd.get(i).getSoluong()*dsmh.get(k).getGiamua();
                            int loinhuan = tienban-tienmua;
                            int soluong = dshd.get(i).getSoluong();
                            String res = dshd.get(i)+" " +dskh.get(j)+" "+dsmh.get(k)+" "+ soluong + " "+tienban;
                            SapXep kq = new SapXep(res, loinhuan);
                            kq.compareTo(kq);
                            dssx.add(kq);
                        }
                    }
                }
            }
        }
        Collections.sort(dssx);
        for(SapXep b : dssx){
            System.out.println(b);
        }
    }
}
