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
public class J02030_sap_xep_chen_liet_ke_nguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        ArrayList<String>kq=new ArrayList<>();
        int res, j, dem=0;
        for(int i=0; i<n; i++){
            res = a[i];
            j=i;
            while(j>0 && res<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            dem++;
            a[j]=res;
            String s=("Buoc "+(i)+": ");
            for(int l=0; l<dem; l++){
                s=s+" "+a[l];
            } 
            kq.add(s);
        }
        Collections.reverse(kq);
        for(String s:kq){
            System.out.println(s);
        }
    }
}
