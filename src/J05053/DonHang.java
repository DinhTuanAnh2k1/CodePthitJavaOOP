/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05053;

/**
 *
 * @author Mr Hieu
 */
public class DonHang implements Comparable<DonHang>{
    private String ten, ma,thutu;
    private int gia, sl, loai, giam, tien,stt;
    
    
    public DonHang(String ten, String ma, int gia, int sl){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
        this.stt = Integer.parseInt(thuTu(ma));
        this.thutu = thuTu(ma);
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
        return ten+" "+ma+" "+thutu+" "+giam+" "+tien;
    }
    
    private String thuTu(String a){
        String res = "";
        for(int i=1; i<=3; i++){
            res = res+a.charAt(i);
        }
        return res;
    }
    public int compareTo(DonHang o){
        if(this.stt<o.stt) return -1;
        if(this.stt>o.stt) return 1;
        return 0;
    }
}
