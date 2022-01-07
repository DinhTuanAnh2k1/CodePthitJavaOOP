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
public class J01005_chia_tam_giac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int h = in.nextInt();
            //chiaTamGiac(n,h);
            for(int i=1; i<n; i++){
                System.out.printf("%1.6f ",Math.sqrt(i/(n*1.0))*h);
            }
            System.out.println("");
        }
    }
    public static void chiaTamGiac(int a, int b){
        for(int i=1; i<a; i++){
            System.out.printf("%1.6f ",Math.sqrt(i/(a*1.0))*b);
        }
    }
}
