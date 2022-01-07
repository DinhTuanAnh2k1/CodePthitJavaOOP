/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07055_xeploai;

/**
 *
 * @author Mr Hieu
 */
public class BangDiem implements Comparable<BangDiem>{
    private String ma, hoten, xeploai;
    private float luyentap, thuchanh, thi, tongket;
    
    public BangDiem(int index, String hoten, float luyentap, float thuchanh,float thi){
        this.ma = "SV"+String.format("%02d", index);
        this.hoten = chuanHoa(hoten);
        this.thi = thi;
        this.thuchanh = thuchanh;
        this.luyentap = luyentap;
        float res = (float)(luyentap*25/100.0)+(thuchanh*35/100)+(thi*40/100);
        this.tongket = (float)Math.round(res*100)/100;
        this.xeploai = xLoai(tongket);
    }
    public String toString(){
        return String.format("%s %s %.2f %s", ma, hoten, tongket, xeploai);
    }
    public int compareTo(BangDiem o){
        if(this.tongket<o.tongket) return 1;
        if(this.tongket>o.tongket) return -1;
        return 0;
    }
    private String xLoai(float a){
        String kq="";
        if(a>=8)
            kq="GIOI";
        else if(a>=6.5 && a<8)
            kq="KHA";
        else if(a>=5&&a<6.5)
            kq="TRUNG BINH";
        else
            kq = "KEM";
        return kq;
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
