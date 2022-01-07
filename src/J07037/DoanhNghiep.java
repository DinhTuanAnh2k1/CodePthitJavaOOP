/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037;

/**
 *
 * @author Mr Hieu
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
    public int compareTo(DoanhNghiep o){
        return this.ma.compareTo(o.ma);
    }
}
