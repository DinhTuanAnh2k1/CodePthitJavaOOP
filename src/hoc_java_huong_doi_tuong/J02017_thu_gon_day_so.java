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
public class J02017_thu_gon_day_so {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        int ktr=1;
        while(true){
            int res=0;
            for(int i=0; i<n-1; i++){
                if((a[i]+a[i+1])%2==0){
                    res=1;
                }
                
            }
        }
    }
}
