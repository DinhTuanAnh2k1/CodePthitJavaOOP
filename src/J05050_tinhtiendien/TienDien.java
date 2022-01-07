/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05050_tinhtiendien;

/**
 *
 * @author Mr Hieu
 */
public class TienDien {
    private String loaisd, ma;
    private long cscu,csmoi, tien, heso, sodien, thanhtien, phutroi;
    
    
    public TienDien(int index, String loaisd, long cscu, long csmoi){
        this.ma = "KH"+String.format("%02d", index);
        this.loaisd = loaisd;
        this.cscu = cscu;
        this.csmoi = csmoi;
        this.sodien = this.csmoi-this.cscu;
        this.heso = HSo(loaisd);
        this.thanhtien = this.heso*this.sodien*550;
        this.phutroi = phuTroi(this.sodien,this.thanhtien);
    }
    
    public String toString(){
        return ma+" "+heso+" "+thanhtien+" "+phutroi+" "+(phutroi+thanhtien);
    }

    private int HSo(String loaisd){
        if(loaisd.equals("KD"))
            return 3;
        else if(loaisd.equals("NN"))
            return 5;
        else if(loaisd.equals("TT"))
            return 4;
        else
            return 2;
    }
    private long phuTroi(long sdien,long tien){
        long res=0;
        if(sdien <50)
            res=0;
        else if(sdien<=100&&sdien>=50)
            res =(long)Math.ceil(tien*35/100.0);
        else if(sdien>100) 
            res = tien;
        return res;
    }
}
