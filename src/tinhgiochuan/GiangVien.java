/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;

/**
 *
 * @author Admin
 */
public class GiangVien {
    private String magv, hoten;
    public GiangVien(String giangvien){
        this.magv = ma(giangvien);
        this.hoten = Ten(giangvien);
    }

    public String getMagv() {
        return magv;
    }

    public String getHoten() {
        return hoten;
    }
    
    private String ma(String a){
        String res  ="";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private String Ten(String a){
        String res  ="";
        int k=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' '){
                k=i+1;
                break;
            }
            
        }
        for(int i=k; i<a.length(); i++)
            res+=a.charAt(i);
        return res;
    }
}
