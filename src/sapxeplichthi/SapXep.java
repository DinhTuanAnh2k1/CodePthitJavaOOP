/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxeplichthi;

/**
 *
 * @author Mr Hieu
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class SapXep implements Comparable<SapXep>{
    private String maca, mamon, phong, tenmon, giothi;
    private int nhom,soluong,gio,phut;
    private Date thoigian;
    public SapXep(String maca,String mamon,String thoigian,int gio,int phut,String phong,String tenmon,int nhom,int soluong) throws ParseException{
        this.maca = maca;
        this.mamon = mamon;
        this.phong = phong;
        this.tenmon = tenmon;
        this.nhom = nhom;
        this.soluong = soluong;
        this.gio = gio;
        this.phut = phut;
        String res=gio+":"+phut;
        this.giothi=res;
        this.thoigian = new SimpleDateFormat("dd/MM/yyyy").parse(thoigian);
    }
    public int compareTo(SapXep o) {
        if(this.thoigian.compareTo(o.thoigian)==0){
            if(this.gio==o.gio){
                {
                    if(this.phut==o.phut)
                        return this.maca.compareTo(o.maca);
                    else if(this.phut<o.phut)
                        return -1;
                    return 1;
                }
            }
            else if(this.gio<o.gio)
                return -1;
            return 1;
        }
        return this.thoigian.compareTo(o.thoigian);
    }
    public String toString(){
        return String.format("%s %s %s %s%d %d", new SimpleDateFormat("dd/MM/yyyy").format(thoigian), giothi,phong,tenmon,nhom,soluong);
    }
}
