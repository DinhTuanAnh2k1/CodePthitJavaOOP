/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05032;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class Tuoi implements Comparable<Tuoi>{
    private String hoten;
    private Date ns;
    public Tuoi(String tentuoi) throws ParseException{
        this.hoten=Ten(tentuoi);
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh(tentuoi));
    }
    public String toString(){
        return String.format("%s",hoten);
    }
    public int compareTo(Tuoi o){
        return ns.compareTo(o.ns);
    }
    private String Ten(String a){
        String res="";
        for(int i = 0; i<a.length()-11; i++){
            res+=a.charAt(i);
        }
        return res;
    }
    private String ngaySinh(String a){
        String ten = Ten(a);
        String res = "";
        for(int i=ten.length()+1; i<a.length(); i++){
            res+=a.charAt(i);
        }
        return res;
    }
}
