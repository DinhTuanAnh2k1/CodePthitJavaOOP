/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_java;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Matranvuong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src\\bai3_java\\MTV.in"));
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("kich thuoc ma tran vuong la: "+n+" x "+n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
