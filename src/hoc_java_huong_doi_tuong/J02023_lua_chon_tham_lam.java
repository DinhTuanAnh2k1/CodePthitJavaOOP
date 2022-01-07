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
import java.math.*;
public class J02023_lua_chon_tham_lam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b = in.nextInt();
        int ktr1=0,ktr2=0;
        double c=0,d=0;
        for(double i=Math.pow(10,(a-1)); i<Math.pow(10, a); i++){
            if(tongChuSo(i)==b){
                c=i;
                ktr1=1;
                break;
            }
        }
        for(double i=Math.pow(10,a)-1; i>=Math.pow(10, a-1); i--){
            if(tongChuSo(i)==b){
                d=i;
                ktr2=1;
                break;
            }
        }
        if(ktr1==1&&ktr2==1){
            System.out.println((int)c+" "+(int)d);
        }
        else{
            System.out.println("-1 -1");
        }
    }
    public static int tongChuSo(double n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
