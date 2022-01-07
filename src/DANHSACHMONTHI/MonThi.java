/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSACHMONTHI;

/**
 *
 * @author Mr Hieu
 */
public class MonThi implements Comparable<MonThi>{
    private String ma,ten,hinhthuc;

    public MonThi(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }
    public String toString(){
        return ma+" "+ten+" "+hinhthuc;
    }
    public int compareTo(MonThi o){
        return this.ma.compareTo(o.ma);
    }
}
