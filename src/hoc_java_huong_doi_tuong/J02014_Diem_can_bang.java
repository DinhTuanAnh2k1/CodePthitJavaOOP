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
public class J02014_Diem_can_bang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] A = new int[n];
            int s=0, d=0, res=-1;
            for(int i=0; i<n; i++){
                A[i] = in.nextInt();
                s+=A[i];
            }
            for(int i=0; i<n-1; i++){
                d+=A[i];
                if(d==(s-d-A[i+1])){
                    res=i+2;
                    break;
                }
            }
            System.out.println(res);
            
        }
    }
}
