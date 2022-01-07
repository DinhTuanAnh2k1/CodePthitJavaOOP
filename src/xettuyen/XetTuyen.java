/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xettuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mr Hieu
 */
public class XetTuyen {
    private String ten, ma;
    private Date ns;
    private float lythuyet,thuchanh, diemtb,diemtong;
    private int tuoi;
    
    public XetTuyen(int index,String ten,String ns,float lythuyet,float thuchanh) throws ParseException{
        this.ma = "PH"+String.format("%02d", index);
        this.ten = chuanHoa(ten);
        int nam = 0;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        String res = ns+"";
        for(int i=res.length()-4;i<res.length();i++){
            nam=nam*10+(res.charAt(i)-'0');
        }
        this.tuoi = 2021-nam;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
        this.diemtb = (lythuyet+thuchanh)/2;
        float thuong=0;
        if(lythuyet>=8&&thuchanh>=8){
            thuong = 1;
        }
        else if(thuong>=7.5&&thuchanh>=7.5)
            thuong = (float)0.5;
        else
            thuong = 0;
        this.diemtong=(int)Math.round(diemtb+thuong);
        
    }
    public String toString(){
        if(diemtong>10)
            diemtong=10;
        String xeploai="";
        if(diemtong>=9)
            xeploai="Xuat sac";
        else if(diemtong ==8)
            xeploai="Gioi";
        else if(diemtong==7)
            xeploai="Kha";
        else if(diemtong>=5)
            xeploai="Trung binh";
        else
            xeploai="Truot";
        return String.format("%s %s %d %d %s", ma,ten,tuoi,(int)diemtong,xeploai);
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
