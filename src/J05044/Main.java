/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05044;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            NhanVien q = new NhanVien(i,in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            ds.add(q);
        }
        String res = in.nextLine();
        for(int i=0; i<ds.size(); i++){
            if(res.equals(ds.get(i).getChucvu()))
                System.out.println(ds.get(i));
        }
    }
}
