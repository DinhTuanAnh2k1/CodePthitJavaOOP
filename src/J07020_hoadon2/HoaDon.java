/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020_hoadon2;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String maHD;
    private String nguoimua;
    private String sanpham;
    private int soluong;

    public HoaDon(int index, String hoadon) {
        this.maHD = "HD"+String.format("%03d", index);
        this.nguoimua = nguoiMua(hoadon);
        this.sanpham = sanPham(hoadon);
        this.soluong = soLuong(hoadon);
    }
    private String nguoiMua(String a){
        String res="";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' ')
                break;
            else
                res+=a.charAt(i);
        }
        return res;
    }
    private String sanPham(String a){
        String res="";
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
            else
                res+=a.charAt(i);
        }
        return res;
    }
    private int soLuong(String a){
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
    public String getMaHD() {
        return maHD;
    }

    public String getNguoimua() {
        return nguoimua;
    }

    public String getSanpham() {
        return sanpham;
    }

    public int getSoluong() {
        return soluong;
    }
    
}
