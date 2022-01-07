/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05052_tracuudonhang;

/**
 *
 * @author Mr Hieu
 */
public class DonHang {
    private String ten, ma, stt;
    private int gia, sl, loai, giam, tien;
    
    
    public DonHang(String ten, String ma, int gia, int sl){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
        this.stt = thuTu(ma);
        this.loai = ma.charAt(4)-'0';
        double kq=0;
        if(loai==1){
            kq=sl*gia*(double)(50/100.0);
        }
        else
            kq=sl*gia*(double)(30/100.0);
        this.giam=(int)Math.round(kq);
        this.tien=gia*sl-giam;
    }
    
    public String toString(){
        return ten+" "+ma+" "+stt+" "+giam+" "+tien;
    }
    
    private String thuTu(String a){
        String res = "";
        for(int i=1; i<=3; i++){
            res = res+a.charAt(i);
        }
        return res;
    }
}
