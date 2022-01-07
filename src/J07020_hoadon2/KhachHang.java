/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020_hoadon2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */

public class KhachHang {
    private String maKH, ten, gioitinh, diachi;
    private Date ngaysinh;

    public KhachHang(int index, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        this.maKH = "KH"+String.format("%03d", index);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTen() {
        return ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getNgaysinh() {
        return new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh);
    }
}
