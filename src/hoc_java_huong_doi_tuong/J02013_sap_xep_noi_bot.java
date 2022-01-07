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
public class J02013_sap_xep_noi_bot {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] A = new int[n];
         for(int i=0; i<n; i++){
             A[i] = in.nextInt();
         }
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
             System.out.print("Buoc "+(i+1)+": ");
             for(int l=0; l<n; l++){
                 System.out.print(A[l] + " ");
             }
             System.out.println("");
         }
    }
   
}
