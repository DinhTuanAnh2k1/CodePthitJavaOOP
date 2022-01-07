/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05040_lapbangtinhcong;

/**
 *
 * @author Mr Hieu
 */
public class TinhCong {
    private String ma, hoten,chucvu;
    private int luongcb,cong,phucap,luongchinh,tongluong,thuong;
    
    public TinhCong(int index,String hoten, int luongcb,int cong,String chucvu){
        this.ma = "NV"+String.format("%02d", index);
        this.hoten = hoten;
        this.luongcb = luongcb;
        this.cong = cong;
        this.chucvu = chucvu;
        this.phucap = PC(chucvu);
        this.luongchinh = luongcb*cong;
        this.thuong = Thuong(cong,this.luongchinh);
        this.tongluong = this.luongchinh+this.phucap+this.thuong;
    }
    public String toString(){
        return ma+" "+hoten+" "+luongchinh+" "+thuong+" "+phucap+" "+tongluong;
    }
    private int PC(String cv){
        int a=0;
        if(cv.equals("GD"))
            a=250000;
        else if(cv.equals("PGD"))
            a=200000;
        else if(cv.equals("TP"))
            a=180000;
        else
            a=150000;
        return a;
    }
    private int Thuong(int a, int b){
        int res=0;
        if(a>=25)
            res=b*20/100;
        else if(a<25&&a>=22)
            res=b*10/100;
        return res;
    }
}
