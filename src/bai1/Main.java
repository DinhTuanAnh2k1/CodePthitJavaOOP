/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src//bai1//HCN.in"));
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Kich thuoc ma tran la: "+ n + " x "+ m);
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                b[i][j] = in.nextInt();
            }
        }
        System.out.println("Ma tran 1:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Ma tran 2:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
