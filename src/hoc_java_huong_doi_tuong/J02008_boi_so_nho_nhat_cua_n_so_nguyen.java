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
public class J02008_boi_so_nho_nhat_cua_n_so_nguyen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextInt();
            long BC = 1;
            for(long i=1; i<=n; i++){
                long res =(BC*i); 
                BC=res/UC(i,BC);
            }
            System.out.println(BC);
        }
    }
    public static long UC(long a, long b){
        if(b==0) return a;
        return UC(b,a%b);
    }
}
