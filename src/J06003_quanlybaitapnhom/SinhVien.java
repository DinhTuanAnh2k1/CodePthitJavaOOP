/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003_quanlybaitapnhom;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String masv, hoten, sdt;
    private int nhom;

    public SinhVien(String masv, String hoten, String sdt, int nhom) {
        this.masv = masv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return masv + " " + hoten + " " + sdt;
    }

    public int getNhom() {
        return nhom;
    }

    
    
}
