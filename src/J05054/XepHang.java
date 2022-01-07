/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;

/**
 *
 * @author Mr Hieu
 */
public class XepHang implements Comparable<XepHang>{
    private String a,ma;

    public XepHang(String a, String ma) {
        this.a = a;
        this.ma = ma;
    }
    public String toString(){
        return a;
    }

    public String getMa() {
        return ma;
    }
    public int compareTo(XepHang o){
        return this.ma.compareTo(o.ma);
    }
}
