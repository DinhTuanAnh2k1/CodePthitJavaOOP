/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BongDa;

/**
 *
 * @author Admin
 */
public class CauLacBo {
    private String maclb, tenclb;
    private int giave, doanhthu;
    public CauLacBo(String maclb, String tenclb, int giave){
        this.maclb=maclb;
        this.tenclb=tenclb;
        this.giave=giave;
    }
    public String toString(){
        return String.format("%s", tenclb);
    }

    public String getMa() {
        return maclb;
    }

    public String getTenclb() {
        return tenclb;
    }
    
    public int getGiave() {
        return giave;
    }
    
}
