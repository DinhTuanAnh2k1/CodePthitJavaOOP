/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

/**
 *
 * @author Admin
 */
public class SinhVien {
    public String ma, hoten, lop, email;
    
    public SinhVien(String ma, String hoten, String lop, String email){
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }
    public String toString(){
        return String.format("%s %s %s %s", ma, hoten, lop, email);
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
}
