/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05035;

/**
 *
 * @author Admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private int thutu;
    private String masv, hoten, lop, email, doanhnghiep;
    public SinhVien(int index, String masv, String hoten,String lop, String email, String doanhnghiep){
        this.thutu=index;
        this.hoten=hoten;
        this.masv=masv;
        this.lop=lop;
        this.email=email;
        this.doanhnghiep=doanhnghiep;
    }
    public String toString(){
        return String.format("%d %s %s %s %s %s",thutu, masv, hoten, lop, email, doanhnghiep);
    }
    public int compareTo(SinhVien o){
        return this.masv.compareTo(o.masv);
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }
}
