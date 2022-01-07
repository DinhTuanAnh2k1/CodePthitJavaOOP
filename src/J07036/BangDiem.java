/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036;

/**
 *
 * @author Admin
 */
public class BangDiem {
    private String msv, mMH;
    private double diem;
    private SinhVien S;
    private MonHoc M;

    public BangDiem(String msv, String mMH, double diem) {
        this.msv = msv;
        this.mMH = mMH;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public String getmMH() {
        return mMH;
    }

    public void setS(SinhVien s) {
        S = s;
    }    

    public void setM(MonHoc m) {
        M = m;
    }

    public String getMaMH() {
        return M.getMa();
    }

    public String getNameMH() {
        return M.getName();
    }

    public String getNameSv() {
        return S.getName();
    }

    public String getLopSv() {
        return S.getLop();
    }

    public double getDiem() {
        return diem;
    }

    public String chuanHoaDiem() {
        if (diem == (int) diem)
            return String.valueOf((int) diem);
        return String.valueOf(diem);
    }

    @Override
    public String toString() {
        return msv + " " + S.getName() + mMH + " " + M.getName() + " " + chuanHoaDiem();
    }
}
