/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07035_bangdiemmonhoc;

import java.util.logging.Logger;

/**
 *
 * @author Mr Hieu
 */
public class BangDiem implements Comparable<BangDiem>{
    private String msv,mmh;
    private double diem;
    private SinhVien A;
    private MonHoc H;

    public BangDiem(String msv, String mmh, double diem) {
        this.msv = msv;
        this.mmh = mmh;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public String getMmh() {
        return mmh;
    }

    public double getDiem() {
        return diem;
    }

    public void setA(SinhVien a) {
        A = a;
    }

    public void setH(MonHoc h) {
        H = h;
    }
    public String getMaMH() {
        return H.getMa();
    }

    public String getNameMH() {
        return H.getName();
    }

    public String getNameSv() {
        return A.getName();
    }

    public String getLopSv() {
        return A.getLop();
    }
    public String chuanhoaDiem(){
        if(diem==(int)diem){
            return String.valueOf((int)diem);
        }
        return String.valueOf(diem);
    }
    public int compareTo(BangDiem o){
        if(this.diem>o.diem) return -1;
        else if(this.diem==o.diem)
            return this.msv.compareTo(o.msv);
        return 1;
    }
    public String toString(){
        return msv+" "+A.getName()+A.getLop()+" "+chuanhoaDiem();
    }
}
