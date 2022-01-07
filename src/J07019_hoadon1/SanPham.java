/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019_hoadon1;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String ma, tensp;
    private int gialoai1, gialoai2;
    
    public SanPham(String ma, String tensp, int gialoai1, int gialoai2){
        this.ma = ma;
        this.tensp = tensp;
        this.gialoai1 = gialoai1;
        this.gialoai2 = gialoai2;
        
    }

    public String getMa() {
        return ma;
    }

    public String getTensp() {
        return tensp;
    }

    public int getGialoai1() {
        return gialoai1;
    }

    public int getGialoai2() {
        return gialoai2;
    }
    
}
