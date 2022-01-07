/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05025;

/**
 *
 * @author Admin
 */
import java.util.*;
public class GiangVien  implements Comparable<GiangVien>{
    private String ma, hoten, bomon, ten;
    
    public GiangVien(int index, String hoten, String bomon){
        this.ma = "GV" + String.format("%02d", index);
        this.hoten = hoten;
        this.bomon = boMon(bomon);
        this.ten = Ten(hoten);
    }
    
    public String toString(){
        return String.format("%s %s %s", ma, hoten, bomon);
    }
    
    private String boMon(String s){
        String res="";        
        s=s.trim();
        s.split("\\s+");
        res+=s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==' '){
                res+=s.charAt(i+1);
            }
        }
        return res.toUpperCase();
    }
    private String Ten(String a){
        String kq="";
        a=a.trim();
        a.split("\\s+");
        for(int i=a.length()-1; i>=0; i--){
            if(a.charAt(i)==' '){
                break;
            } 
            kq+=a.charAt(i);
        }   
        StringBuilder res = new StringBuilder(kq);
        res.reverse();
        return res.toString();
    }
    public int compareTo(GiangVien o){
        if(this.ten.compareTo(o.ten) >=0) return 1;
        return -1;
    }
}
