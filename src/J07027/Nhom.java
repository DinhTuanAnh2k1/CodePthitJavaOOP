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
public class Nhom {
    private String msv;
    private int id;
    private SinhVien S;
    private BaiTap B;

    public Nhom(String msv, int id) {
        this.msv = msv;
        this.id = id;
    }

    public String getMsv() {
        return msv;
    }

    public int getId() {
        return id;
    }

    public void setS(SinhVien s) {
        S = s;
    }

    public void setB(BaiTap b) {
        B = b;
    }

    @Override
    public String toString() {
        return msv + " " + S.getName() + " " + S.getSdt() + " " + id + " " + B.getName();
    }
}
