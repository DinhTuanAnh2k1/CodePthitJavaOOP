/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ma,hoten,lop,email;

    public SinhVien(String ma, String hoten, String lop, String email) {
        this.ma = ma;
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.email = email;
    }
    public String toString(){
        return ma+" "+hoten+" "+lop;
    }

    public String getMa() {
        return ma;
    }
    
    private String chuanHoa(String s){
        s=s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] res = s.split(" ");
        s="";
        for(int i=0;i<res.length;i++){
            s+=String.valueOf(res[i].charAt(0)).toUpperCase()+res[i].substring(1);
            if(i<res.length-1)
                s+=" ";
                    
        }
        return s;
    }
}
