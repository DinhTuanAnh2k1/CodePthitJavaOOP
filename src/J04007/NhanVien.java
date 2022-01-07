/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04007;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class NhanVien {
    private String hoten, gioitinh, diachi, mathue;
    private Date ns, nky;
    public NhanVien(String hoten, String gioitinh, String ns, String diachi, String mathue, String nky) throws ParseException{
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.diachi = diachi;
        this.mathue = mathue;
        this.nky = new SimpleDateFormat("dd/mm/yyyy").parse(nky);
    }
    public String toString(){
        return String.format("00001 %s %s %s %s %s %s", hoten, gioitinh, new SimpleDateFormat("dd/mm/yyyy").format(ns), diachi, mathue, new SimpleDateFormat("dd/mm/yyyy").format(nky));
    }
}
