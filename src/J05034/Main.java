/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05034;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            SinhVien q = new SinhVien(i,in.nextLine(),in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        int test=Integer.parseInt(in.nextLine());
        while(test-->0){
            String doanhNghiep=in.nextLine();
            for(SinhVien a:ds){
                String res=a.getDoanhnghiep();
                if(res.equals(doanhNghiep))
                    System.out.println(a);
            }
        }
    }
}
