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
public class J01013_Tong_uoc_so {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum = 0;
        int[] A = new int[10000];
        for(int i=2; i<10000; i++) A[i]=1;
        for(int i=2; i<10000; i++){
            if(A[i]==1){
                for(int j=i*i; j<10000; j+=i){
                    A[j]=0;
                }
            }
        }
        while(t-->0){
            int n = in.nextInt();
            for(int i=2; i<10000; i++){
                if(A[i]==1 && n%i==0){
                    sum+=i;
                    n/=i;
                    while(n%i==0){
                        sum+=i;
                        n/=i;
                    }
                }
            }
            if(n>1) sum+=n;
        }
        System.out.println(sum);
    }
}