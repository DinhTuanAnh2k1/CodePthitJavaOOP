/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05026;

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
            String mon = in.nextLine();
            String boMon =bomon(mon);
            System.out.println("DANH SACH GIANG VIEN BO MON "+boMon+":");
            for(GiangVien a:ds){
                if(a.getMon().equals(mon)){
                    System.out.println(a);
                }
            }
            System.out.println();
        }
        
    }
    public static String bomon(String s){
        String res="";        
        s=s.trim();
        s.split("\\s+");
        res+=s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==' '){
                res+=s.charAt(i+1);
            }
        }
        return res.toUpperCase();
    }
}
