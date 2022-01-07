/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachsanpham;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> dssp = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            SanPham q = new SanPham(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            dssp.add(q);
        }
        Collections.sort(dssp);
        for(SanPham a : dssp){
            System.out.println(a);
        }
    }
}
