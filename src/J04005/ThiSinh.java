/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class ThiSinh {
    private String hoten;
    private Date ns;
    private float diem1, diem2, diem3;
    private float diemtong;
    public ThiSinh(String hoten, String ns, float diem1, float diem2, float diem3) throws ParseException{
        this.hoten = hoten;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemtong = this.diem1+this.diem2+this.diem3;
    }
    public String toString(){
        return String.format("%s %s %.1f", hoten, new SimpleDateFormat("dd/mm/yyyy").format(ns), diemtong);
    }
}
