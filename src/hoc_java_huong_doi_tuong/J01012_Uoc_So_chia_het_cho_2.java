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
public class J01012_Uoc_So_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            long n = in.nextInt();
            int dem=0;
            for(long i=1; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    if(i*i==n && i%2==0) dem++;
                    else{
                        if(i%2==0) dem++;
                        if((n/i)%2==0) dem++;
                    }
                }
            }
            System.out.println(dem);
        }
    }
    
}
