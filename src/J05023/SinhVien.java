/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05023;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ma, hoten, lop, email;
    
    public SinhVien(String ma, String hoten, String lop, String email){
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }
    public String toString(){
        return String.format("%s %s %s %s", ma, hoten, lop, email);
    }

    public int getLop() {
        return Khoa(lop);
    }
    private int Khoa(String a){
        int res=a.charAt(1)-'0';
        res=res*10+a.charAt(2)-'0';
        return res;
    } 
}
