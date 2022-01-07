/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006_quanlybanhang2;

/**
 *
 * @author Admin
 */
public class MatHang {
    private String masp, tensp, donvi;
    private int giamua, giaban;

    public MatHang(int masp, String tensp, String donvi, int giamua, int giaban) {
        this.masp = "MH"+String.format("%03d", masp);
        this.tensp = tensp;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return tensp;
    }

    public int getGiaban() {
        return giaban;
    }

    public int getGiamua() {
        return giamua;
    }

    public String getMasp() {
        return masp;
    }
}
