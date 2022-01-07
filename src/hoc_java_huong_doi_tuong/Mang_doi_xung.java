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
public class Mang_doi_xung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i=0; i<n; i++){
                A[i] = in.nextInt();
            }
            int ktr=1;
            for(int i=0; i<n; i++){
                if(A[i] != A[n-1-i]){
                    ktr=0;
                    break;
                }
            }
            if(ktr==1) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}
