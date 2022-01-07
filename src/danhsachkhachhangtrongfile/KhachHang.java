/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachkhachhangtrongfile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten,gioitinh,diachi;
    private Date ngaysinh;
    
    public KhachHang(int index, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException{
        this.ma = "KH" + String.format("%03d", index);
        this.ten = chuanHoa(ten);
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.diachi = diachi;
    }

    public String toString(){
        return String.format("%s %s %s %s %s", ma,ten,gioitinh,diachi,new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh));
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
        return this.ngaysinh.compareTo(o.ngaysinh);
    }
}
