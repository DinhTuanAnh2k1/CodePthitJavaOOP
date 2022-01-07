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
public class Boi_chung_uoc_chung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a = in.nextInt();
            long b = in.nextInt();
            long UC=UCLN(a,b);
            long BCNN = (long)(a*b)/UC;
            System.out.println(BCNN +" " + UC);
        }
        
    }
    public static long UCLN(long a, long b){
        if(b==0) return a;
        return UCLN(b,a%b);
    }
}
