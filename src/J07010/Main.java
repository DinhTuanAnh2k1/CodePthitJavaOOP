/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07010;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            SinhVien q = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()));
            ds.add(q);
        }
        for(SinhVien a:ds){
            System.out.println(a);
        }
    }
}
