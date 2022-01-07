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
public class J01014_Uoc_so_nguyen_to_lon_nhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum=0;
        while(t-->0){
            long n = in.nextLong();
            for(long i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    while(n%i==0){
                    sum=i;
                    n/=i;
                    }
                }              
            }
            if(n>1) sum=n;
            System.out.println(sum);
        }
        
    }
}
