/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaiphong;

/**
 *
 * @author Admin
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu, tenloai;
    private String dongia;
    private String phiphucvu;
    public LoaiPhong(String phong){
        this.kyhieu = phong.charAt(0)+"";
        this.tenloai=ten(phong);
        this.dongia = gia(phong);
        this.phiphucvu = bo(phong);
    }
    public String toString(){
        return kyhieu+" "+tenloai+" "+dongia+" "+phiphucvu;
    }
    public int compareTo(LoaiPhong o){
        return this.tenloai.compareTo(o.tenloai);
    }
    private String ten(String s){
        String res="";
        for(int i=2; i<s.length();i++){
            if(s.charAt(i)==' ')
                break;
            res+=s.charAt(i);
        }
        return res;
    }
    private String gia(String s){
        String res="";
        int k=0;
        for(int i=2; i<s.length();i++){
            if(s.charAt(i)==' '){
                k=i+1;
                break;
            }
                
            
        }
        for(int i=k; i<s.length();i++){
            if(s.charAt(i)==' ')
                break;
            res+=s.charAt(i);
        }
        return res;
    }
    private String bo(String s){
        String res="";
        int k=0;
        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i)==' '){
                k=i+1;
                break;
            }
                
            
        }
        for(int i=k; i<s.length();i++){
            if(s.charAt(i)==' ')
                break;
            res+=s.charAt(i);
        }
        return res;
    }
}
