/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapsepmathang;

/**
 *
 * @author Mr Hieu
 */
public class MatHang implements Comparable<MatHang>{
    private String ma,ten,nhom;
    private float mua,ban,loinhuan;

    public MatHang(int index, String ten, String nhom, float mua, float ban) {
        this.ma = "MH"+String.format("%02d", index);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan=ban-mua;
    }
    public String toString(){
        return String.format("%s %s %s %.2f", ma,ten,nhom,loinhuan);
    }
    public int compareTo(MatHang o){
        if(this.loinhuan<o.loinhuan) return 1;
        if(this.loinhuan>o.loinhuan) return -1;
        return 0;
    }
}
