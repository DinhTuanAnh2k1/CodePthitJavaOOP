/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02032_sap_xep_noi_bot_liet_ke_nguoc {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int test = in.nextInt();
         while(test-->0){
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i=0; i<n; i++){
                A[i] = in.nextInt();
            }
            ArrayList<String>kq = new ArrayList<>();
            for(int i=0; i<n; i++){
                int ktr = 1;
                for(int j=0; j<n-1-i; j++){
                    if(A[j] > A[j+1]){
                        int a = A[j];
                        A[j] = A[j+1];
                        A[j+1] = a;
                        ktr=0;
                    }
                }
                if(ktr==1) break;
                String s="Buoc "+(i+1)+": ";
                for(int l=0; l<n; l++){
                   s=s+" "+A[l];
                }
                kq.add(s);

            }
            Collections.reverse(kq);
            for(String s:kq){
               System.out.println(s);
           }
         }
         
    }
}
