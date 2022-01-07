/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("SINHVIEN.in"));
        Scanner in2 = new Scanner(new File("MONHOC.in"));
        Scanner in3 = new Scanner(new File("BANGDIEM.in"));
        ArrayList<SinhVien>dssv = new ArrayList<>();
        ArrayList<MonHoc>dsmh = new ArrayList<>();
        ArrayList<BangDiem>dsbd = new ArrayList<>();
        int t1=Integer.parseInt(in1.nextLine());
        while(t1-->0){
            SinhVien q = new SinhVien(in1.nextLine(),in1.nextLine(),in1.nextLine(),in1.nextLine());
            dssv.add(q);
        }
        int t2=Integer.parseInt(in2.nextLine());
        while(t2-->0){
            MonHoc q = new MonHoc(in2.nextLine(),in2.nextLine(),in2.nextLine());
            dsmh.add(q);
        }
        int t3=Integer.parseInt(in3.nextLine());
        while(t3-->0){
            BangDiem q = new BangDiem(in3.nextLine());
            q.compareTo(q);
            dsbd.add(q);
        }
        Collections.sort(dsbd);
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String mamon = in.nextLine();
            for(int i=0;i<dsmh.size();i++){
                if(mamon.equals(dsmh.get(i).getMa())){
                    System.out.println("BANG DIEM MON "+dsmh.get(i).getTen()+":");
                }
            }
            for(int i=0;i<dsbd.size();i++){
                if(dsbd.get(i).getMamon().equals(mamon)){
                    for(int j=0;j<dssv.size();j++){
                        if(dsbd.get(i).getMasv().equals(dssv.get(j).getMa())){
                            System.out.println(dssv.get(j)+"\n"+dsbd.get(i));
                        }
                    }
                }
            }
            //System.out.println("");
        }
    }
}
