/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochuan;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        ArrayList<GioChuan> dsgc = new ArrayList<>();
        Scanner in1 = new Scanner(new File("MONHOC.in")); 
        Scanner in2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner in3 = new Scanner(new File("GIOCHUAN.in"));
        int t1 = Integer.parseInt(in1.nextLine());
        while(t1-->0){
            MonHoc q = new MonHoc(in1.nextLine());
            dsmh.add(q);
        }
        int t2 = Integer.parseInt(in2.nextLine());
        for(int i=1; i<=t2; i++){
            GiangVien q = new GiangVien(in2.nextLine());
            dsgv.add(q);
        }
        int t3 = Integer.parseInt(in3.nextLine());
        while(t3-->0){
            GioChuan q = new GioChuan(in3.nextLine());
            dsgc.add(q);
        }
        for(int i=0;i<dsgv.size();i++){
            String magv=dsgv.get(i).getMagv();
            float giotong=0;
            for(int j=0;j<dsgc.size();j++){
                if(magv.equals(dsgc.get(j).getMa()))
                    giotong+=dsgc.get(j).getGio();
            }
            System.out.print(dsgv.get(i).getHoten()+" ");
            System.out.printf("%.2f\n",giotong);
        }
    }    
}
