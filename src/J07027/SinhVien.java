/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ma, name, sdt;

    public SinhVien(String ma, String name, String sdt) {
        this.ma = ma;
        this.name = name;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }
}
