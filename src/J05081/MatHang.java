/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081;

/**
 *
 * @author Admin
 */
public class MatHang implements Comparable<MatHang>{
    private String tensp, donvi, ma;
    private int giamua,giaban, loinhuan;
    
    public MatHang(int index, String tensp, String donvi, int giamua, int giaban){
        this.ma = "MH"+String.format("%03d", index);
        this.tensp = tensp;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }
    public String toString(){
        return String.format("%s %s %s %d %d %d", ma,tensp,donvi,giamua,giaban,loinhuan);
    }
    public int compareTo(MatHang o){
        if(this.loinhuan<o.loinhuan) return 1;
        if(this.loinhuan>o.loinhuan) return -1;
        return 0;
    }
}
