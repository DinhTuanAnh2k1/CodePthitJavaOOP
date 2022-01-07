/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

/**
 *
 * @author Admin
 */
public class BaiTap {
    private String baitap;
    private int mabaitap;

    public BaiTap(int index, String baitap) {
        this.baitap = baitap;
        this.mabaitap = index;
    }

    public String getBaitap() {
        return baitap;
    }

    public int getMabaitap() {
        return mabaitap;
    }
    
}
