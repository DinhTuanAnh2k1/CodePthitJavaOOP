/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002;

/**
 *
 * @author Admin
 */
import java.util.*;
public class HCN {
    private float dai, rong, chuvi, dientich;
    private String mau;
    public HCN(float dai, float rong, String mau){
        this.dai = dai;
        this.rong = rong;
        this.chuvi = (this.dai + this.rong) * 2;
        this.dientich = this.dai * this.rong;
        this.mau = chuanHoa(mau);
    }
    public String toString(){
        if(ktr(this.dai,this.rong)==0){
            return String.format("INVALID");
        }
        else
            return String.format("%.0f %.0f %s", chuvi, dientich, mau);
    }
    private int ktr(float a, float b){
        if(a<=0 || b<=0) return 0;
        return 1;
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
