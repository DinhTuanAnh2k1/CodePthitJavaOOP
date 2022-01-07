/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07035_bangdiemmonhoc;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien>dssv=new ArrayList<>();
        ArrayList<MonHoc>dsmh=new ArrayList<>();
        ArrayList<BangDiem>dsbd=new ArrayList<>();
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            SinhVien q = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            dssv.add(q);
        }
        in=new Scanner(new File("MONHOC.in"));
        t=Integer.parseInt(in.nextLine());
        while(t-->0){
            MonHoc q = new MonHoc(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
            dsmh.add(q);
        }
        in=new Scanner(new File("BANGDIEM.in"));
        t=Integer.parseInt(in.nextLine());
        while(t-->0){
            BangDiem q = new BangDiem(in.next(),in.next(),in.nextDouble());
            for(SinhVien x:dssv){
                if(x.getMa().equals(q.getMsv()))
                    q.setA(x);
            }
            for(MonHoc x:dsmh){
                if(x.getMa().equals(q.getMmh()))
                        q.setH(x);
            }
            dsbd.add(q);
        }
        Collections.sort(dsbd);
        Scanner in1 = new Scanner(System.in);
        //in.nextLine();
        t=Integer.parseInt(in1.nextLine());
        while(t-->0){
            String s = in1.nextLine();
            for(int i=0;i<dsbd.size();i++){
                if(s.equals(dsbd.get(i).getMmh())){
                    System.out.println("BANG DIEM MON "+dsbd.get(i).getNameMH()+":");
                    break;
                }
            }
            for(BangDiem x:dsbd){
                if(x.getMmh().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
