/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003;

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
    @Override
    public String toString(){
        return tu + "/" +mau;
    }
    private long usc(long a, long b){
        while(b>0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public void rutGon(){
        long x = usc(tu,mau);
        tu=tu/x;
        mau=mau/x;
    }
}
