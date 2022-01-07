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
public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int test=1;
        while(t-->0){
            System.out.println("Test "+ test + ":");
            int n = in.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for(int i=0; i<n; i++){
                A[i] = in.nextInt();
            }
            int k=0;
            for(int i=0; i<n; i++){
                int ktr=1;
                for(int j=0; j<k; j++){
                    if(A[i]==B[j]){
                        ktr=0;
                        break;
                    }
                }
                if(ktr==1){
                    System.out.print( A[i] + " xuat hien ");
                    int dem=1;
                    for(int l=i+1; l<n; l++){
                        if(A[l]==A[i]) dem++;
                    }
                    System.out.println( dem + " lan");
                    B[k]=A[i];
                    k++;
                }
                else{
                    continue;
                }
            } 
            test++;
        }
    }
}
