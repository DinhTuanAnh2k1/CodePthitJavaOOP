/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachtrungtuyen;

/**
 *
 * @author Mr Hieu
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, hoten;
    private float toan,ly,hoa,uutien, diemtong;

    public ThiSinh(String ma, String hoten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.hoten = chuanHoa(hoten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        
        this.uutien = uT(ma);
        this.diemtong = toan*2+ly+hoa+uutien; 
        if(this.uutien==(int)this.uutien)
            this.uutien=(int)this.uutien;
        if(this.diemtong==(int)this.diemtong)
            this.diemtong=(int)this.diemtong;
    }

    public float getDiemtong() {
        return diemtong;
    }
    public String toString(){
        if((this.uutien==(int)this.uutien)&&(this.diemtong==(int)this.diemtong))
            return ma+" "+hoten+" "+(int)uutien+" "+(int)diemtong;
        if((this.uutien==(int)this.uutien)&&(this.diemtong!=(int)this.diemtong))
            return ma+" "+hoten+" "+(int)uutien+" "+diemtong;
        if((this.uutien!=(int)this.uutien)&&(this.diemtong==(int)this.diemtong))
            return ma+" "+hoten+" "+uutien+" "+(int)diemtong;
        return ma+" "+hoten+" "+uutien+" "+diemtong;
    }
    private float uT(String a){
        float res=0;
        String kv="";
        for(int i=0;i<3;i++){
            kv+=a.charAt(i);
        }
        if(kv.equals("KV1"))
            res=(float)0.5;
        if(kv.equals("KV2"))
            res=(float)1.0;
        if(kv.equals("KV3"))
            res=(float)2.5;
        return res;
    }
    public int compareTo(ThiSinh o){
        if(this.diemtong<o.diemtong) return 1;
        if(this.diemtong>o.diemtong) return -1;
        return this.ma.compareTo(o.ma);
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
}
