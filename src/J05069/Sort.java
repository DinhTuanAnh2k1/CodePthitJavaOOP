/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05069;

/**
 *
 * @author Admin
 */
public class Sort {
    private String maten;
    private int tien;
    public Sort(String maten, int tien){
        this.maten=maten;
        this.tien=tien;
    }
    public String toString(){
        return maten+" "+tien;
    }
    public int compareTo(Sort o){
        if(this.tien>o.tien) return -1;
        if(this.tien<o.tien) return 1;
        return this.maten.compareTo(o.maten);
    }
}
