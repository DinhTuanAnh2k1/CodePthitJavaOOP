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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class KhachHang {
    private String makh,hoten,diachi,masp;
    private int soluong;
    private Date ngaymua;

    public KhachHang(int index,String hoten, String diachi, String masp, int soluong, String ngaymua) throws ParseException{
        this.makh = "KH"+String.format("%02d", index);
        this.hoten = hoten;
        this.diachi = diachi;
        this.masp = masp;
        this.soluong = soluong;
        this.ngaymua = new SimpleDateFormat("dd/MM/yyyy").parse(ngaymua);
    }
    public String toString(){
        return String.format("%s %s %s", makh,hoten,diachi);
    }
    public String getMasp() {
        return masp;
    }

    public int getSoluong() {
        return soluong;
    }

    public Date getNgaymua() {
        return ngaymua;
    }
    
}
