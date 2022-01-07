/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05023;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien>ds=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            SinhVien p = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        int test = sc.nextInt();
        while(test-->0){
            String s = sc.next();
            int kq=s.charAt(2)-'0';
            kq=kq*10+s.charAt(3)-'0';
            System.out.println("DANH SACH SINH VIEN KHOA "+s+":");
            for(SinhVien a:ds){
                if(a.getLop()==kq){
                    System.out.println(a);
                }
            }
            System.out.println();
        }
    }
}
