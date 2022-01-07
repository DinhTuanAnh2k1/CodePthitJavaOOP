/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapJ07056_tinhtiendien;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> dskh = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            KhachHang q = new KhachHang(i,in.nextLine(),in.nextLine());
            dskh.add(q);
        }
        Collections.sort(dskh);
        for(KhachHang tmp:dskh){
            System.out.println(tmp);
        }
    }
}
class KhachHang implements Comparable<KhachHang>{
    private String id, hoten, loai;
    private int sodien,trongdinhmuc,vuotdinhmuc,tienthue,tiennop;
    
    public KhachHang(int index, String hoten, String ds){
        this.id=String.format("KH%02d", index);
        String s[]=hoten.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String x:s){
            ans+=String.valueOf(x.charAt(0)).toUpperCase()+x.substring(1)+" ";
        }
        this.hoten=ans;
        this.sodien = CSC(ds)-CSD(ds);
        this.loai = ds.charAt(0)+"";
        this.trongdinhmuc = TDMuc();
        this.vuotdinhmuc = TVDMuc();
        this.tienthue = this.vuotdinhmuc*5/100;
        this.tiennop = this.trongdinhmuc+this.vuotdinhmuc+this.tienthue;
    }
    private int CSD(String a){
        int res=0;
        int k=0;
        for(int i=2;i<a.length();i++){
            if(a.charAt(i)==' '){
                k=i;
                break;
            }
        }
        for(int i=2;i<k;i++){
            res=res*10+a.charAt(i)-'0';
        }
        return res;
    }
    private int CSC(String a){
        int res=0;
        int k=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)==' '){
                k=i;
                break;
            }
        }
        for(int i=k+1;i<a.length();i++){
            res=res*10+a.charAt(i)-'0';
        }
        return res;
    }
    private int TDMuc(){
        int kq=0;
        if(loai.equals("A")){
            if(sodien<=100){
                kq=sodien*450;
            }
            else{
                kq=100*450;
            }
        }
            
        else if(loai.equals("B")){
            if(sodien<=500){
                kq=sodien*450;
            }
            else{
                kq=500*450;
            }
        }
            
        else{
            if(sodien<=200){
                kq=sodien*450;
            }
            else{
                kq=200*450;
            }
        }
        return kq;
    }
    private int TVDMuc(){
        int kq=0;
        if(loai.equals("A")){
            if(sodien>100){
                kq=(sodien-100)*1000;
            }
        }
        else if(loai.equals("B")){
            if(sodien>500){
                kq=(sodien-500)*1000;
            }
        }
        else{
            if(sodien>200){
                kq=(sodien-200)*1000;
            }
        }
        return kq;
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.tiennop<o.tiennop) return 1;
        else if(this.tiennop>o.tiennop) return -1;
        return 0;
//To change body of generated methods, choose Tools | Templates.
    }
    public String toString(){
        return id+" "+hoten+ " "+trongdinhmuc+" "+vuotdinhmuc+" "+tienthue+" "+tiennop;
    }
}
