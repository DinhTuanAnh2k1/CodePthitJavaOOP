/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054;

/**
 *
 * @author Mr Hieu
 */
public class BangDiem implements Comparable<BangDiem>{

    public float getTb() {
        return tb;
    }
    private String ma,hoten;
    private float mon1,mon2,mon3;
    private float tb;
    
    public BangDiem(int index, String hoten, float mon1, float mon2, float mon3){
        this.ma = "SV"+String.format("%02d", index);
        this.hoten = chuanHoa(hoten);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        float tong = (float)((mon1*3+mon2*3+mon3*2)/8.0);
        this.tb = (float)Math.round(tong*100.0)/100;
        
    }
    
    public String toString(){
        return String.format("%s %s %.2f", ma, hoten, tb);
    }
    public int compareTo(BangDiem o){
        if(this.tb<o.tb) return 1;
        if(this.tb>o.tb) return -1;
        return 0;
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
