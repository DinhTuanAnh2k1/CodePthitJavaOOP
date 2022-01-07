/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07059_danhsachcathi;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> dsct = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            CaThi q = new CaThi(i,in.nextLine(),in.nextLine(),in.nextLine());
            dsct.add(q);
        }
        Collections.sort(dsct);
        for(CaThi a:dsct){
            System.out.println(a);
        }
    }
}
class CaThi implements Comparable<CaThi>{
    private String id,phong;
    private Date ngaythi, giothi;
    public CaThi(int index,String ngaythi, String giothi, String phong) throws ParseException{
        this.id = String.format("C%03d", index);
        this.ngaythi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythi);
        this.giothi = new SimpleDateFormat("HH:mm").parse(giothi);
        this.phong = phong;
    }
    public String toString(){
        return id+" "+(String.format("%s", new SimpleDateFormat("dd/MM/yyyy").format(ngaythi)))+" "+(String.format("%s", new SimpleDateFormat("HH:mm").format(giothi)))+" "+phong;
    }

    @Override
    public int compareTo(CaThi o) {
        if(this.ngaythi.compareTo(o.ngaythi)==0){
            if(this.giothi.compareTo(o.giothi)==0){
                return this.id.compareTo(o.id);
            }
            return this.giothi.compareTo(o.giothi);
        }
        return this.ngaythi.compareTo(o.ngaythi);
    }
}