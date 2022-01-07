/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006_quanlybanhang2;

/**
 *
 * @author Admin
 */
public class SapXep implements Comparable<SapXep>{
    private String kq;
    private int loinhuan;

    public SapXep(String kq, int loinhuan) {
        this.kq = kq;
        this.loinhuan = loinhuan;
    }

    @Override
    public String toString() {
        return kq+" " + loinhuan;
    }
    public int compareTo(SapXep o){
        if(this.loinhuan>o.loinhuan) return -1;
        if(this.loinhuan<o.loinhuan) return 1;
        return 0;
    }
}
