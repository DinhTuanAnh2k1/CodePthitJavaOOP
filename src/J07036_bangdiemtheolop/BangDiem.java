/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036_bangdiemtheolop;

/**
 *
 * @author Admin
 */
public class BangDiem implements Comparable<BangDiem>{
    private String masv,mamon,diem;
    
    public BangDiem(String msv,String mamon,String diem){
        this.masv = masv;
        this.mamon = mamon;
        this.diem = diem;
    }
    public String toString(){
        return diem;
    }
    public int compareTo(BangDiem o){
        if(this.mamon.compareTo(o.mamon)==0){
            this.masv.compareTo(o.masv);
        }
        return this.mamon.compareTo(o.mamon);
    }
    public String getMasv() {
        return masv;
    }

    public String getMamon() {
        return mamon;
    }
    
    private String maSV(String a){
        String res ="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private String maMON(String a){
        String res ="";
        int k=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ')
            {
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
    private String DIEM(String a){
        String res ="";
        int k=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)==' ')
            {
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
