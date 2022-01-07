/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoai;

/**
 *
 * @author Admin
 */
public class TinhTien {
    private String so;
    private int sophut;
    
    public TinhTien(String a){
        this.so=maVung(a);
        this.sophut=Time(a);
    }

    public String getSo() {
        return so;
    }

    public int getSophut() {
        return sophut;
    }
    public String toString(){
        return so;
    }
    private int soPhut(String b){
        int kq=0;
        int gio1=0,phut1=0,gio2=0,phut2=0;
        for(int i=b.length()-11; i<b.length()-9; i++){
            gio1=gio1*10+b.charAt(i)-'0';
        }
        for(int i=b.length()-8; i<b.length()-6; i++){
            phut1=phut1*10+b.charAt(i)-'0';
        }
        for(int i=b.length()-5; i<b.length()-3; i++){
            gio2=gio2*10+b.charAt(i)-'0';
        }
        for(int i=b.length()-2; i<b.length(); i++){
            phut2=phut2*10+b.charAt(i)-'0';
        }
        kq=(gio2*60+phut2)-(gio1*60+phut1);
        return kq;
    }
    private String maVung(String b){
        String kq="";
        for(int i=0; i<b.length()-12; i++){
            kq+=b.charAt(i);
        }
        return kq;
    }
    private int Time(String b){
        int tg=0;
        if((b.charAt(0)-'0')!=0){
            if(soPhut(b)%3!=0)
                tg=(int)soPhut(b)/3+1;
            else{
                tg=soPhut(b);
            }
        }
        else
            tg=soPhut(b);
        return tg;
    }
}
