/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057_diemtuyensinh;

/**
 *
 * @author Mr Hieu
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String hoten,dantoc,kv,ma,trangthai;
    private float diem, uutien, tong;

    public ThiSinh(int index, String hoten, float diem, String dantoc, String kv) {
        this.ma = "TS"+String.format("%02d", index);
        this.hoten = chuanHoa(hoten);
        this.dantoc = dantoc;
        this.kv = kv;
        this.diem = diem;
        this.uutien = UT(kv,dantoc);
        this.tong = this.diem+this.uutien;
        this.trangthai = TT(this.tong);
    }
    public String toString(){
        return String.format("%s %s %.1f %s", ma,hoten,tong,trangthai);
    }
    public int compareTo(ThiSinh o){
        if(this.tong<o.tong) return 1;
        else if(this.tong>o.tong) return -1;
        return 0;
    }
    private String TT(float a){
        String res="";
        if(a>=20.5)
            res="Do";
        else res = "Truot";
        return res;
    }
    private float UT(String a, String b){
        float res=0;
        if(a.equals("1"))
            res+=1.5;
        else if(a.equals("2"))
            res+=1;
        else if(a.equals("3"))
            res+=0;
        if(b.equals("Kinh")){
            res+=0;
        }
        else{
            res+=1.5;
        }
        return res;
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
