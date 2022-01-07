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
public class HoaDon {
    private String mahoadon, ma;
    private int soluong, hesogiam, loai;
    
    public HoaDon(int index, String mahoadon){
        this.mahoadon = hoaDon(mahoadon) + "-" + String.format("%03d", index);
        this.soluong = soLuong(mahoadon);
        this.hesogiam = giamGia(this.soluong);
        this.ma = maSP(mahoadon);
        this.loai = Loai(mahoadon);
    }

    public int getLoai() {
        return loai;
    }

    public String getMa() {
        return ma;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getHesogiam() {
        return hesogiam;
    }
    private int soLuong(String a){
        int kq=0;
        for(int i=4; i<a.length(); i++){
            kq = kq*10+a.charAt(i)-'0';
        }
        return kq;
    }
    private int Loai(String a){
        int kq=0;
        kq = kq*10+a.charAt(2)-'0';
        
        return kq;
    }
    private String hoaDon(String a){
        String kq="";
        for(int i=0; i<3; i++){
            kq+=a.charAt(i);
        }
        return kq;
    }
    private int giamGia(int a){
        int kq=0;
        if(a>=150){
            kq = 50;
        }
        if(a>=100&&a<150){
            kq = 30;
        }
        if(a>=50&&a<100)
            kq = 15;
        if(a<50)
            kq = 0;
        return kq;
    }
    private String maSP(String a){
        String kq="";
        for(int i=0; i<2; i++){
            kq+=a.charAt(i);
        }
        return kq;
    }
}
