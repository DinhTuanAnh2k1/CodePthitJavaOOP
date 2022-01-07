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
public class Sap_xep_chon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = in.nextInt();
        }
        int test=1;
        for(int i=0; i<n-1; i++){
            System.out.print("Buoc " + test + ": ");
            int j=i;
            
            for(int k=i+1; k<n; k++){
                if(A[k]<A[j]){
                    j=k;
                }
            }
            if(j!=i){
                int b=A[j];
                A[j]=A[i];
                A[i]=b;
            }
            for(int l=0; l<n; l++){
                System.out.print(A[l]+" ");
            }
            System.out.println("");
            test++;
        }
    }
}
