/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05045;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(ds);
        for(int i=0; i<ds.size(); i++){
            
                System.out.println(ds.get(i));
        }
    }
}
