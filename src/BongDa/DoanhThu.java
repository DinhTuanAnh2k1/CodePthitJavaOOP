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
public class DoanhThu {
   private String matran, maclb;
   private int soluong;
   public DoanhThu(String doanhthu){
        this.matran=maTran(doanhthu);
        this.soluong=doanhThu(doanhthu);
        this.maclb=maDoi(matran);
   }
    public String getMatran() {
        return matran;
    }

    public String getMaclb() {
        return maclb;
    }

    public int getSoluong() {
        return soluong;
    }
   
   private String maDoi(String a){
       String res="";
       res+=a.charAt(1);
       res+=a.charAt(2);
       return res;
   }
   public String toString(){
       return matran;
   }
   private int doanhThu(String a){
       int tien=0;
       for(int i=5; i<a.length(); i++){
           tien=tien*10+a.charAt(i)-'0';
       }
       return tien;
   }
   private String maTran(String a){
       String res="";
       for(int i=0; i<4; i++){
           res+=a.charAt(i);
       }
       return res;
   }
   
}
