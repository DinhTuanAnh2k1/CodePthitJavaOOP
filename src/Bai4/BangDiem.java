/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class BangDiem implements Comparable<BangDiem>{
    private String masv,mamon,diem;
    private float diemdung;
    public BangDiem(String bangdiem){
        this.masv=maSV(bangdiem);
        this.mamon=maMon(bangdiem);
        this.diem=Diem(bangdiem);
        this.diemdung=Float.parseFloat(Diem(bangdiem));
    }

    public String getMamon() {
        return mamon;
    }

    public String getMasv() {
        return masv;
    }
    
    public String toString(){
        return diem;
    }
    public int compareTo(BangDiem o){
        if(this.diemdung==o.diemdung){
            return this.masv.compareTo(o.masv);
        }
        if(this.diemdung>o.diemdung) return -1;
        return 1;
    }
    private String maSV(String a){
        String res = "";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private String maMon(String a){
        String res="";
        int k=0;
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)==' '){
                k=i+1;
                break;
            }
        }
        for(int i=k;i<a.length();i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private String Diem(String a){
        String res="";
        int k=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)==' '){
                k=i+1;
                break;
            }
        }
        for(int i=k;i<a.length();i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
}
