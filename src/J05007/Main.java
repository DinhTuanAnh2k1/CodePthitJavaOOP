/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05007;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<NhanVien> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            NhanVien q = new NhanVien(i,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(NhanVien a : ds){
            System.out.println(a);
        }
    }
}
