/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06004;

/**
 *
 * @author Admin
 */
public class Nhom {
    private String baitap;
    private int nhombt;

    public Nhom(int nhombt, String baitap) {
        this.baitap = baitap;
        this.nhombt = nhombt;
    }
    
    @Override
    public String toString() {
        return  String.format("%s", baitap);
    }

    public int getNhombt() {
        return nhombt;
    }
}
