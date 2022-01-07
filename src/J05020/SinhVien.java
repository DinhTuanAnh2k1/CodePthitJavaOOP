/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05020;

/**
 *
 * @author Admin
 */
import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
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
    public int compareTo(SinhVien o){
        if(this.lop.compareTo(o.lop)==0){
            return this.ma.compareTo(o.ma);
        }
        return this.lop.compareTo(o.lop);
    }
}
