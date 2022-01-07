/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020_hoadon2;

/**
 *
 * @author Admin
 */
public class MatHang {
    private String maMH, ten, donvi;
    private int giamua, giaban;

    public MatHang(int index, String ten, String donvi, int giamua, int giaban) {
        this.maMH = "MH"+String.format("%03d", index);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTen() {
        return ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public int getGiamua() {
        return giamua;
    }

    public int getGiaban() {
        return giaban;
    }
    
}
