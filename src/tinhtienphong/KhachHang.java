/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtienphong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mr Hieu
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ten, phong,ma;
    private Date nhan,tra;
    private int tang,dichvu;
    private long ngayo,tien;
    public KhachHang(int index, String ten, String phong, String nhan,String tra,int dichvu) throws ParseException{
        this.ma = "KH"+String.format("%02d", index);
        this.ten = chuanHoa(ten);
        this.phong = phong;
        this.tang = phong.charAt(0)-'0';
        this.nhan = new SimpleDateFormat("dd/MM/yyyy").parse(nhan);
        this.tra = new SimpleDateFormat("dd/MM/yyyy").parse(tra);
        this.ngayo = (this.tra.getTime()-this.nhan.getTime())/(24*60*60*1000)+1;
        this.dichvu = dichvu;
        int hs =0;
        if(tang==1)
            hs=25;
        else if(tang==2)
            hs=34;
        else if(tang==3)
            hs=50;
        else if(tang==4)
            hs=80;
        this.tien=hs*ngayo+dichvu;
    }
    public String toString(){
        return ma+" "+ten+" "+phong+" "+ngayo+" "+tien;
    }
    
    private String chuanHoa(String str){
        str = str.toLowerCase();
            str = str.trim();
            str = str.replaceAll("\\s+", " ");
            String tmp[] = str.split(" ");
            str = "";
            for(int i = 0; i < tmp.length; i++){
                str += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if(i<tmp.length-1)
                    str += " ";
            }
            if(str.charAt(str.length()-1)==' ') str+="\b";
        return str;
    }
    public int compareTo(KhachHang o){
        if(this.tien<o.tien) return 1;
        if(this.tien>o.tien) return -1;
        return 0;
    }
}
