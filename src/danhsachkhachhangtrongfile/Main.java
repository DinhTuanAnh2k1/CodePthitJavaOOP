/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachkhachhangtrongfile;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<KhachHang> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            KhachHang q = new KhachHang(i,in.nextLine(), in.nextLine(),in.nextLine(),in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(KhachHang a : ds){
            System.out.println(a);
        }
    }
}
