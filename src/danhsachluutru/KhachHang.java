/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachluutru;

/**
 *
 * @author Admin
 */
import java.text.*;
import java.time.*;
import java.util.Date;
import static java.util.concurrent.TimeUnit.DAYS;
public class KhachHang implements Comparable<KhachHang>{
    private String makh,hoten,maphong;
    private Date ngayden,ngaydi;
    private long songay;
    
    private int songayo;
    public KhachHang(int index,String hoten, String maphong, String ngayden, String ngaydi) throws ParseException {
        this.makh = "KH"+String.format("%02d", index);
        this.hoten = hoten;
        this.maphong = maphong;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        this.songay = (this.ngaydi.getTime()-this.ngayden.getTime())/(24*60*60*1000);
    }
    public String toString(){
        return makh+" "+hoten+" "+maphong+" "+songay;
    }
    public int compareTo(KhachHang o){
        if(this.songay<o.songay) return 1;
        if(this.songay>o.songay) return -1;
        return 1;
    }
}
