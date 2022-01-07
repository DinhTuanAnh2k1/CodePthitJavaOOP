/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05029;

/**
 *
 * @author Admin
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int soluong;
    
    public DoanhNghiep(String ma, String ten, int soluong){
        this.ma=ma;
        this.ten=ten;
        this.soluong=soluong;
    }
    public String toString(){
        return String.format("%s %s %d", ma, ten, soluong);
    }

    public int getSoluong() {
        return soluong;
    }
    
    public int compareTo(DoanhNghiep o){
        if(this.soluong>o.soluong) return -1;
        if(this.soluong<o.soluong) return 1;
        return this.ma.compareTo(o.ma);
    }
}
