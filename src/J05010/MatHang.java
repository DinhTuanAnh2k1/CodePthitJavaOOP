/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

/**
 *
 * @author Mr Hieu
 */
public class MatHang implements Comparable<MatHang>{
    private String ten,nhom;
    private int ma;
    private float mua,ban,loi;

    public MatHang(int ma, String ten, String nhom, float mua, float ban) {
        this.ten = ten;
        this.nhom = nhom;
        this.ma = ma;
        this.mua = mua;
        this.ban = ban;
        this.loi = ban-mua;
    }
    public String toString(){
        return String.format("%d %s %s %.2f", ma, ten, nhom, loi);
    }
    public int compareTo(MatHang o){
        if(this.loi<o.loi) return 1;
        else if(this.loi>o.loi) return -1;
        return 0;
    }
}
