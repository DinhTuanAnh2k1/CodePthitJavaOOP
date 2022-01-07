/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006_quanlybanhang2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String makh, tenkh, gt, diachi;
    private Date ns;

    public KhachHang(int index, String tenkh, String gt, String ns, String diachi) throws ParseException {
        this.tenkh = tenkh;
        this.gt = gt;
        this.diachi = diachi;
        this.makh = "KH"+String.format("%03d", index);
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
    }

    @Override
    public String toString() {
        return tenkh + " "+diachi;
    }

    public String getMakh() {
        return makh;
    }
}
