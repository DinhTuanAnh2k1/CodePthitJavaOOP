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

public class J02106_matrannhiphan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][3];
        for(int i=0;i<n; i++){
            for(int j=0; j<3; j++){
                a[i][j]=in.nextInt();
            }
        }
        int dem=0;
        for(int i=0; i<n; i++){
            int res=0;
            for(int j=0; j<3; j++){
                if(a[i][j]==1){
                    res+=1;
                }
            }
            if(res>=2)
                dem+=1;
        }
        System.out.println(dem);
    }
}
