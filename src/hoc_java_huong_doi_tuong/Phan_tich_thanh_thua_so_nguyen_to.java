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
public class Phan_tich_thanh_thua_so_nguyen_to {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int k=1;
        while(t-->0){
            int n=in.nextInt();
            System.out.print("Test "+k+": ");
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    
                    System.out.print(i+"(");
                    int dem=0;
                    while(n%i==0){
                        dem++;
                        n/=i;
                    }
                    System.out.print(dem+") ");
                }
            }
            if(n>1) System.out.println(n+"(1)");
            else System.out.println("");
            k++;
        }
    }

    
}
