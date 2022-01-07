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
public class J01007_Kiem_tra_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            long f1=1, f2=1, fn=1, ktr=0;
            if(n<2) System.out.println("YES");
            else{
                while(fn<n){
                    f1 = f2;
                    f2 = fn;
                    fn = f1 + f2;
                    if(fn==n){
                        System.out.println("YES");
                        ktr=1;
                    }
                }
                if(ktr==0) 
                    System.out.println("NO");
            }
            
        }
    }
}
