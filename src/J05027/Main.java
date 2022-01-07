/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05027;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<GiangVien> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i<=t; i++){
            GiangVien q = new GiangVien(i, in.nextLine(), in.nextLine());
            ds.add(q);
        }
        int test = Integer.parseInt(in.nextLine());
        while(test-->0){
            String key = in.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+key+":");
            key=key.toLowerCase();
            
            for(GiangVien a:ds){
                String kq = a.getHoten().toLowerCase();
                if(kq.contains(key))
                    System.out.println(a);
            }
        }
    }
}
