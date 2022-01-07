/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03020_tim_tu_thuan_nghich_dai_nhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ds[] = new String[1000];
        int dem[] = new int[100], n=0;
        while(in.hasNext()){
            String tmp = in.next();
            if(thuanNghich(tmp)){
                int t = tim(tmp,ds,n);
                if(t==-1){
                    ds[n]=tmp;
                    dem[n]=1;
                    n++;
                }
                else dem[t]++;
            }
        }
        int max=0;
        for(int i=0; i<n; i++){
            if(ds[i].length()>max){
                max = ds[i].length();
            }
        }
        for(int i=0;i<n;i++){
            if(ds[i].length()==max){
                System.out.println(ds[i] + " " + dem[i]);
            }
        }
    }
    public static boolean thuanNghich(String s){
        StringBuilder rs = new StringBuilder(s);
        rs.reverse();
        return s.equals(rs.toString());
    }  
    public static int tim(String s, String ds[], int n){
        for(int i=0;i<n;i++){
            if(ds[i].equals(s)) return i;
        }
        return -1;
    }
}
