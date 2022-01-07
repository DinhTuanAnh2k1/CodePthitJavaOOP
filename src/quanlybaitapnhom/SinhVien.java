/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaitapnhom;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ma,hoten,sdt;

    public SinhVien(String ma, String hoten, String sdt) {
        this.ma = ma;
        this.hoten = chuanHoa(hoten);
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public String getSdt() {
        return sdt;
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
