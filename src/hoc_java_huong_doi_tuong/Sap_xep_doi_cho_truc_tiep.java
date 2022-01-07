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
public class Sap_xep_doi_cho_truc_tiep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i=0; i<n; i++){
                A[i] = in.nextInt();
            }
            int test=1;
            for(int i=0; i<n-1; i++){
                
                for(int j = i+1; j<n; j++){
                    if(A[i]>A[j]){
                        int a=A[i];
                        A[i]=A[j];
                        A[j]=a;
                    }
                }System.out.print("Buoc " + test + ": ");
                test++;
                for(int l=0; l<n; l++){
                    System.out.print(A[l]+" ");
                }
                System.out.println("");
            }
        
    }
}
