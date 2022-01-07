/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05043;

/**
 *
 * @author Admin
 */
import java.math.*;
public class NhanVien {
    private String ma, hoten, chucvu;
    private int luongcb, ngaycong, phucap, tongluong, tamung, conlai;
    
    public NhanVien(int index, String hoten, String chucvu, int luongcb, int ngaycong){
        this.ma = "NV"+String.format("%02d", index);
        this.hoten = hoten;
        this.chucvu = chucvu;
        this.phucap = phuCap(chucvu);
        this.luongcb = luongcb * ngaycong;
        this.tongluong = this.phucap + this.luongcb;
        this.tamung = tamUng(this.tongluong);
        this.conlai = this.tongluong - this.tamung;
    }
    
    public String toString(){
        return String.format("%s %s %d %d %d %d", ma, hoten, phucap, luongcb, tamung, conlai);
    }
    private int phuCap(String a){
        if(a.equals("GD")) 
            return 500;
        if(a.equals("PGD")) 
            return 400;
        if(a.equals("TP")) 
            return 300;
        if(a.equals("KT")) 
            return 250;
        return 100;
    }
    private int tamUng(int a){
        float res = a*(float)2/3;
        if(res<25000)
            return Math.round(res/1000)*1000;
        else
            return 25000;
    }
}
