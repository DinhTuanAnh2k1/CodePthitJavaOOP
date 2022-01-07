/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05027;

/**
 *
 * @author Admin
 */
public class GiangVien {
    private String ma, hoten, bomon, mon;
    
    public GiangVien(int index, String hoten, String bomon){
        this.ma = "GV" + String.format("%02d", index);
        this.hoten = hoten;
        this.bomon = boMon(bomon);
        this.mon=bomon;
        
    }

    public String getHoten() {
        return hoten.toLowerCase();
    }

    

    public String getMon() {
        return mon;
    }

    public String getBomon() {
        return bomon;
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
}
