/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhngayhethanbaohanh;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String ma,ten;
    private int gia,baohanh;

    public SanPham(String ma, String ten, int gia, int baohanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baohanh = baohanh;
    }
    public String toString(){
        return ma+" "+ten+" "+gia+" "+baohanh;
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }

    public int getBaohanh() {
        return baohanh;
    }
    
}
