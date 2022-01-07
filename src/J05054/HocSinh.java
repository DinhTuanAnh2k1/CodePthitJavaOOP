/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;

/**
 *
 * @author Mr Hieu
 */
public class HocSinh implements Comparable<HocSinh>{
    private String hoten,ma, xeploai;
    private float diem;

    public HocSinh(int index, String hoten, float diem) {
        this.ma = "HS"+String.format("%02d", index);
        this.hoten = hoten;
        this.diem = diem;
        this.xeploai=xL(diem);
    }

    public String getMa() {
        return ma;
    }
    public String toString(){
        return String.format("%s %s %s %.1f",ma, hoten,xeploai,diem);  
    }
    public int compareTo(HocSinh o){
        if(this.diem<o.diem) return 1;
        else if(this.diem>o.diem) return -1;
        return 0;
    }
    private String xL(float a){
        String res="";
        if(a>=9)
            res="Gioi";
        else if(a>=7&&a<9)
            res="Kha";
        else if(a<7&&a>=5)
            res="Trung Binh";
        else if(a<5)
            res="Yeu";
        return res;
    }
    public float getDiem() {
        return diem;
    }
    
}
