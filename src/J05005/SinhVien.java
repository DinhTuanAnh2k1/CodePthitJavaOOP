/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05005;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class SinhVien implements Comparable<SinhVien>{
    private String ma, hoten, lop;
    private Date ns;
    private float gpa;
    
    public SinhVien(int index,String hoten, String lop, String ns, float gpa) throws ParseException{
        this.ma = "B20DCCN" + String.format("%03d", index);
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f", ma, hoten, lop, new SimpleDateFormat("dd/mm/yyyy").format(ns), gpa);
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
    public int compareTo(SinhVien o){
        if(this.gpa>o.gpa) return -1;
        if(this.gpa<o.gpa) return 1;
        return 0;
    }
}
