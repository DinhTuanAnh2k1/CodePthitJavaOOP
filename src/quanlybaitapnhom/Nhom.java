/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

/**
 *
 * @author Admin
 */
public class Nhom implements Comparable<Nhom>{
    private String masv;
    private int thutubaitap;
    public Nhom(String danhsach){
        this.masv = maSV(danhsach);
        this.thutubaitap = thuTu(danhsach);
    }

    public String getMasv() {
        return masv;
    }

    public int getThutubaitap() {
        return thutubaitap;
    }
    public int compareTo(Nhom o){
        return this.masv.compareTo(o.masv);
    }
    private String maSV(String a){
        String res ="";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' ')
                break;
            else
                res+=a.charAt(i);
        }
        return res;
    }
    private int thuTu(String a){
        int res=0,k=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' '){
                k=i+1;
                break;
            }
        }
        for(int i=k; i<a.length(); i++){
            res = res*10+a.charAt(i)-'0';
        }
        return res;
    }
}
