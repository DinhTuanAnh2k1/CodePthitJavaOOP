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
public class J02105_Danh_sach_ke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            System.out.print("List("+(i+1)+") = ");
            
            for(int j=0; j<n; j++){
                if(a[i][j]==1){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println("");
            
        }
    }
    
}
