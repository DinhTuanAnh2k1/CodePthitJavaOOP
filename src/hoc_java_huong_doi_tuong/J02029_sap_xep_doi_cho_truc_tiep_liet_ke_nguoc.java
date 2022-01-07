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
public class J02029_sap_xep_doi_cho_truc_tiep_liet_ke_nguoc {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
             int n = in.nextInt();
            int[] A = new int[n];
            for(int i=0; i<n; i++){
                A[i] = in.nextInt();
            }
            ArrayList<String>kq=new ArrayList<>();
            int test=1;
            for(int i=0; i<n-1; i++){
                
                for(int j = i+1; j<n; j++){
                    if(A[i]>A[j]){
                        int a=A[i];
                        A[i]=A[j];
                        A[j]=a;
                    }
                }
                String s=("Buoc " + test + ": ");
                test++;
                for(int l=0; l<n; l++){
                    s = s+" "+A[l];
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
