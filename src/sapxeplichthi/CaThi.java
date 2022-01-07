/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxeplichthi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mr Hieu
 */
public class CaThi {
    private String ma,thoigian,phong;
    private String ngaythi;
    private int gio, phut;

    public CaThi(int ma, String ngaythi, String thoigian, String phong) throws ParseException {
        this.ma = "C"+String.format("%03d", ma);
        this.ngaythi = (ngaythi);
        this.thoigian = thoigian;
        this.phong = phong;
        int res=0;
        for(int i=0;i<2;i++){
            res=res*10+thoigian.charAt(i)-'0';
        }
        this.gio=res;
        int kq=0;
        for(int i=3;i<5;i++){
            kq=kq*10+thoigian.charAt(i)-'0';
        }
        this.phut=kq;
    }
    public String getPhong(){
        return phong;
        
    }

//    public String toString(){
//        return String.format("%s %s %s %s", ma,new SimpleDateFormat("dd/MM/yyyy").format(ngaythi),thoigian,phong);
    public String getNgaythi() {
        return ngaythi;
    }

//
//    }
    public int compareTo(CaThi o) {
        if(this.ngaythi.compareTo(o.ngaythi)==0){
            if(this.gio==o.gio){
                {
                    if(this.phut==o.phut)
                        return 0;
                    else if(this.phut<o.phut)
                        return -1;
                    return 1;
                }
            }
            else if(this.gio<o.gio)
                return -1;
            return 1;
        }
        return this.ngaythi.compareTo(o.ngaythi);
    }

    public void setNgaythi(String ngaythi) {
        this.ngaythi = ngaythi;
    }

    public String getMa() {
        return ma;
    }

    public String getThoigian() {
        return thoigian;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }
    
}
