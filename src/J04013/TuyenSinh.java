/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04013;

/**
 *
 * @author Admin
 */
import java.util.*;

public class TuyenSinh {
  private float toan, ly, hoa, tong, uutien;
  private String hoten, ma, ketqua;
  
  public TuyenSinh(String ma, String hoten, float toan, float ly, float hoa){
      this.toan = toan;
      this.ly = ly;
      this.hoa = hoa;
      this.hoten = hoten;
      this.tong = this.toan * 2 + this.ly + this.hoa;
      this.ma = ma;
      this.uutien = diemUuTien(this.ma);
      this.ketqua = ketQua(this.tong + this.uutien);
  }
  
  public String toString(){
      if(uutien==(int)uutien  && tong == (int)tong){
          return String.format("%s %s %.0f %.0f %s", ma, hoten, uutien, tong, ketqua);
      }
      if(uutien==(int)uutien  && tong != (int)tong){
          return String.format("%s %s %.0f %.1f %s", ma, hoten, uutien, tong, ketqua);
      }
      if(uutien!=(int)uutien  && tong == (int)tong){
          return String.format("%s %s %.1f %.0f %s", ma, hoten, uutien, tong, ketqua);
      }
      return String.format("%s %s %.1f %.1f %s", ma, hoten, uutien, tong, ketqua);
  }
  
  private float diemUuTien(String s){
      String tmp="";
      float diem = 0;
      for(int i=0; i<3;i++){
          tmp+=s.charAt(i);
      }
      if(tmp.equals("KV1")){
          diem=(float)0.5;
          return diem;
      }
      if(tmp.equals("KV2")){
          diem=(float)1;
          return diem;
      }
      return (float)2.5;
  }
  private String ketQua(float a){
      String kq ="";
      if(a<24){
          kq="TRUOT";
      } 
      else{
          kq = "TRUNG TUYEN";
      }
      return kq;
  }
}
