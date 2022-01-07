/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042;

/**
 *
 * @author Mr Hieu
 */
public class XepHang implements Comparable<XepHang>{
    private String hoten;
    private long dung,test;

    public XepHang(String hoten, String diem) {
        this.hoten = hoten;
        String res="", kq="";
        int k=0;
        for(int i=0;i<diem.length();i++){
            if(diem.charAt(i)==' '){
                k=i+1;
                break;
            }
            res+=diem.charAt(i);
        }
        for(int i=k;i<diem.length();i++)
            kq+=diem.charAt(i);
        this.dung = Long.parseLong(res);
        this.test = Long.parseLong(kq);
    }
    public String toString(){
        return hoten+" "+dung+" "+test;
    }
    public int compareTo(XepHang o){
        if(this.dung<o.dung) return 1;
        else if(this.dung==o.dung){
            if(this.test<o.test) return -1;
            else if(this.test>o.test) return 1;
            else{
                return this.hoten.compareTo(o.hoten);
            }
        }
        return -1;
    }
}
