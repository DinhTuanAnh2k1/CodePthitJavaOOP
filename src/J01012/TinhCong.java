/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01012;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class TinhCong {
    private String hoten;
    private float luongcb, thuong, phucap, tongnhan;
    public TinhCong(String hoten, float luong, float ngaycong, String chucvu){
        this.hoten = hoten;
        this.luongcb = luong * ngaycong;
        this.phucap = luongPhuCap(chucvu);
        this.thuong = luongThuong(ngaycong,this.luongcb);
        this.tongnhan = this.luongcb + this.thuong + this.phucap;
    }
    public String toString(){
        return String.format("NV01 %s %.0f %.0f %.0f %.0f", hoten, luongcb, thuong, phucap, tongnhan);
    }
    private float luongPhuCap(String s){
        if("GD".equals(s)) return 250000;
        if("PGD".equals(s)) return 200000;
        if("TP".equals(s)) return 180000;
        if("NV".equals(s)) return 150000;
        return 0;
    }
    private float luongThuong(float nc, float tien){
        if(nc<22) return 0;
        else if (nc>=22 && nc <25) return (tien*10/100);
        else return (tien*20/100);
    }
}
