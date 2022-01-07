/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036_bangdiemtheolop;

/**
 *
 * @author Admin
 */
public class DanhSach {
    private String thongtin,lop;

    public DanhSach(String thongtin, String lop) {
        this.thongtin = thongtin;
        this.lop = lop;
    }

    public String getThongtin() {
        return thongtin;
    }

    public String getLop() {
        return lop;
    }
    public String toString(){
        return thongtin;
    }
}
