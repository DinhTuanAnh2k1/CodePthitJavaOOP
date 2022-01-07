/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003_quanlybaitapnhom;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<Nhom> dsbt = new ArrayList<>();
        int t1=in.nextInt();
        int t2=in.nextInt();
        in.nextLine();
        while(t1-->0){
            SinhVien q = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            dssv.add(q);
        }
        //int t3 = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t2; i++){
            String res = in.nextLine();
            //System.out.println(res);
            Nhom a = new Nhom(i,res);
            dsbt.add(a);
        }
        int t4 = in.nextInt();
        while(t4-->0){
            int t5 = in.nextInt();
            System.out.println("DANH SACH NHOM "+t5+":");
            for(int i=0;i<dssv.size();i++){
                if(t5==dssv.get(i).getNhom()){
                    System.out.println(dssv.get(i));
                }
            }
            System.out.print("Bai tap dang ky: ");
            for(int i=0;i<dsbt.size();i++){
                if(t5==dsbt.get(i).getNhombt())
                    System.out.println(dsbt.get(i));
            }
        }
    }
}
