/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien>ds=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            SinhVien p = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0){
            String s = sc.nextLine();
            String kq=nganh(s);
            
            System.out.println("DANH SACH SINH VIEN NGANH "+s.toUpperCase()+":");
            for(SinhVien a:ds){
                String maSV=a.getMa();
                String nganhHoc = "";
                nganhHoc+=maSV.charAt(5);
                nganhHoc+=maSV.charAt(6);
                if(kq.equals(nganhHoc)){
                    if(kq.equals("CN")||kq.equals("AT")){
                        String maLop=a.getLop();
                        if(maLop.charAt(0)=='E')
                            continue;
                        else
                            System.out.println(a);
                    }
                    else
                        System.out.println(a);
                }
            }   
        }
    }
    public static String nganh(String s){
        String res="";
        s=s.trim();
        s.split("\\s+");
        res+=s.charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                
                res+=s.charAt(i+1);
                break;
            }
        }
        return res.toUpperCase();
    }
}
