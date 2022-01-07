/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04006;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class SinhVien {
    private String ma, hoten, lop;
    private Date ns;
    private float gpa;
    
    public SinhVien(String hoten, String lop, String ns, float gpa) throws ParseException{
        this.ma = "B20DCCN001";
        this.hoten = hoten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.gpa = gpa;
    }
    public String toString(){
        return String.format("%s %s %s %s %.2f", ma, hoten, lop, new SimpleDateFormat("dd/mm/yyyy").format(ns), gpa);
    }
}
