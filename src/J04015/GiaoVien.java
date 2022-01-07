/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015;

/**
 *
 * @author Admin
 */
import java.util.*;
public class GiaoVien {
    private String ma, hoten;
    private int hsluong, phucap, luongcb, tongluong;
    
    public GiaoVien(String ma, String hoten, int luongcb){
        this.ma=ma;
        this.hoten=hoten;
        this.luongcb=luongcb;
        this.hsluong=heSoLuong(ma);
        this.phucap=phuCap(ma);
        this.tongluong=this.hsluong*this.luongcb+this.phucap;
    }
    public String toString(){
        return String.format("%s %s %d %d %d", ma, hoten, hsluong, phucap, tongluong);
    }
    private int heSoLuong(String a){
        int res=0;
        res=res*10+(a.charAt(2)-'0');
        res=res*10+(a.charAt(3)-'0');
        return res;
    }
    private int phuCap(String a){
        String res="";
        res=res+a.charAt(0);
        res=res+a.charAt(1);
        if(res.equals("HT")){
            return 2000000;
        }
        if(res.equals("HP"))
            return 900000;
        return 500000;
    }
}
