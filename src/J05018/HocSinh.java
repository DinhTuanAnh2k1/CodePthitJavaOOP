/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05018;

/**
 *
 * @author Admin
 */
import java.text.ParseException;
import java.util.*;
import java.math.*;
public class HocSinh implements Comparable<HocSinh>{
    private String ma, hoten, xeploai;
    private double tongket;
    private double[] diem;
    
    public HocSinh(int index, String hoten, String bangDiem) throws ParseException{
        this.ma = "HS" + String.format("%02d", index);
        this.hoten = hoten;
        this.diem = getDiem(bangDiem);
        this.tongket = (double)diemtb(this.diem);
        this.xeploai = hocLuc(this.tongket);
    }
    public String toString(){
        return String.format("%s %s %.1f %s", ma, hoten, tongket, xeploai);
    }
    private double[] getDiem(String bangDiem){
        double diem[] = new double[10];
        String[] res = bangDiem.trim().split("\\s+");
        for(int i=0; i<10; i++){
            diem[i]=Double.parseDouble(res[i]);
        }
        return diem;
    }
    private double diemtb(double a[]){
        double kq=0;
        for(int i=0; i<10; i++){
            if(i==0 || i==1){
                kq+=(a[i]*2);
            }
            else{
                kq+=a[i];
            }
            
        }
        kq/=12;
        return ((double)Math.round(kq*10)/10);
    }
    private String hocLuc(double a){
        String s="";
        if(a>=9) s="XUAT SAC";
        else if(a>=8 && a<9) s="GIOI";
        else if(a>=7 && a<8) s="KHA";
        else if(a>=5 && a<7) s="TB";
        else s="YEU";
        return s;
    }
    public int compareTo(HocSinh o){
        if(this.tongket<o.tongket) return 1;
        if(this.tongket>o.tongket) return -1;
        return 0;
    }
    
    
}
