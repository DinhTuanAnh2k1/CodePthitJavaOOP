/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05029;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i<=t; i++){
            DoanhNghiep q = new DoanhNghiep(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        int Q = in.nextInt();
        while(Q-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",a,b);
            for(DoanhNghiep k : ds){
                
                if(k.getSoluong()<=b && k.getSoluong()>=a){
                    System.out.println(k);
                }
            }
            System.out.println();
        }
    }
}
