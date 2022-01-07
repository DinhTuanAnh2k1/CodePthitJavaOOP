/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036_bangdiemtheolop;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String masv, hoten,lop,email;

    public SinhVien(String masv, String hoten, String lop, String email) {
        this.masv = masv;
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public String getLop() {
        return lop;
    }
    public String toString(){
        return masv+" "+hoten;
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
