/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public String toString(){
        return tu + "/" +mau;
    }
    private long usc(long a, long b){
        if(b==0){
            return a;
        }
        else{
            return usc(b,a%b);
        }
    }
    public void rutGon(){
        long x = usc(tu,mau);
        tu = tu/x;
        mau = mau/x;
    }
    public PhanSo phanSoC(PhanSo p){
        PhanSo tongC = new PhanSo(1,1);
        tongC.tu = this.tu * p.mau + this.mau * p.tu;
        tongC.tu *= tongC.tu;
        tongC.mau = this.mau * p.mau;
        tongC.mau *= tongC.mau;
        return tongC;
    }
    public PhanSo phanSoD(PhanSo p){
        PhanSo tongD = new PhanSo(1,1);
        tongD.tu = this.tu * p.tu;
        tongD.mau = this.mau * p.mau;
        return tongD;
    }
}
