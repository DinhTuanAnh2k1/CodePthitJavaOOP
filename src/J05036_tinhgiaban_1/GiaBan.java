/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05036_tinhgiaban_1;

/**
 *
 * @author Mr Hieu
 */
public class GiaBan {
    private String ten, donvi, ma;
    private long gia, soluong, vanchuyen,thanhtien,giaban;
    
    public GiaBan(int index, String ten, String donvi, long gia, long soluong){
        this.ma = "MH"+String.format("%02d", index);
        this.ten = ten;
        this.gia = gia;
        this.donvi = donvi;
        this.soluong = soluong;
        this.vanchuyen = (long)Math.round(gia * soluong * 5 / 100.0);
        this.thanhtien = gia * soluong + vanchuyen;
        this.giaban = (long)Math.round(thanhtien * 102 / 100.0);
    }
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+vanchuyen+" "+thanhtien+" "+giaban;
    }
}
