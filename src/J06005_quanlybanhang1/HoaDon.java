/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06005_quanlybanhang1;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String makh, mamh, mahd;
    private int soluong;
    public HoaDon(int index,String sanpham){
        this.mahd = "HD"+String.format("%03d", index);
        this.makh = khachHang(sanpham);
        this.mamh = sP(sanpham);
        this.soluong = sL(sanpham);
    }

    @Override
    public String toString() {
        return mahd;
    }

    public String getMakh() {
        return makh;
    }

    public String getMamh() {
        return mamh;
    }

    public int getSoluong() {
        return soluong;
    }
    
    private String khachHang(String a){
        String res = "";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private String sP(String a){
        String res = "";
        int k=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' '){
                k=i+1;
                break;
            }    
        }
        for(int i=k; i<a.length(); i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private int sL(String a){
        int res=0;
        int k=0;
        for(int i=a.length()-1; i>=0; i--){
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
