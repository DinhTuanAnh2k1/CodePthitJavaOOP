/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

/**
 *
 * @author Mr Hieu
 */
public class ThuKhoa implements Comparable<ThuKhoa>{
    private String hoten,ns;
    private int ma;
    private float d1,d2,d3,tong;

    public ThuKhoa(int index,String hoten, String ns, float d1, float d2, float d3) {
        this.hoten = hoten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong=d1+d2+d3;
        this.ma = index;
    }
    public String toString(){
        return String.format("%d %s %s %.1f", ma,hoten,ns,tong);
    }
    public int compareTo(ThuKhoa o){
        if(this.tong<o.tong) return 1;
        else if(this.tong>o.tong) return -1;
        return 0;
    }

    public float getTong() {
        return tong;
    }
    
}
