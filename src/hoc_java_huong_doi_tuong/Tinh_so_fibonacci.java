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
public class Tinh_so_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            long f1=1, f2=1, fn=1;
            for (int i = 2; i < n; i++) {
                f1 = f2;
                f2 = fn;
                fn = f1 + f2;
            }
            System.out.println(fn);
        }
    }
    
}
