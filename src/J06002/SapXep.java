/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06002;

/**
 *
 * @author Admin
 */
public class SapXep implements Comparable<SapXep>{
    private String thongtin;
    private float giatra,giamgia;

    public SapXep(String thongtin, float giatra, float giamgia) {
        this.thongtin = thongtin;
        this.giatra = giatra;
        this.giamgia = giamgia;
    }

    public String toString(){
        return String.format("%s %.0f %.0f", thongtin,giamgia,giatra);
    }
    public int compareTo(SapXep o){
        if(this.giatra<o.giatra) return 1;
        if(this.giatra>o.giatra) return -1;
        return 0;
    }
}
