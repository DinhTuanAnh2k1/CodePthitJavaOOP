/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05030;

/**
 *
 * @author Admin
 */
import java.util.*;
public class BangDiem implements Comparable<BangDiem>{
    private String ma, hoten, lop;
    private float diem1,diem2,diem3;
    
    public BangDiem(String ma, String hoten, String lop, float diem1, float diem2, float diem3){
        this.ma=ma;
        this.hoten=hoten;
        this.lop=lop;
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }
    public String toString(){
        return String.format("%s %s %s %.1f %.1f %.1f", ma, hoten, lop, diem1, diem2, diem3);
    }
    public int compareTo(BangDiem o){
        return this.ma.compareTo(o.ma);
    }
}
