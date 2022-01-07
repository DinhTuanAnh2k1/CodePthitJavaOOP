/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachluutru;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<KhachHang> dskh = new ArrayList<>();
        Scanner in = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            KhachHang q = new KhachHang(i,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            //q.compareTo(q);
            dskh.add(q);
        }
        Collections.sort(dskh);
        for(KhachHang a : dskh){
            System.out.println(a);
        }
    }
}
