/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02031_sap_xep_chon_liet_ke_nguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i]= in.nextInt();
        }
        sapXep(a,n);
    }
    public static void sapXep(int a[], int n){
        int i,j,t;
        ArrayList<String>kq = new ArrayList<>();
        for(i=0; i<n-1; i++){
            int min = i;
            for(j=i+1; j<n; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            t = a[i]; a[i]=a[min]; a[min] = t;
            String s = "Buoc "+(i+1) + ":";
            for(j =0; j<n; j++) s= s+" "+a[j];
            kq.add(s);
        }
        Collections.reverse(kq);
        for(String s:kq){
            System.out.println(s);
        }
    }
}
