/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02016_bo_ba_so_py_ta_go {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
                a[i]=a[i]*a[i];
            }
            if(Pytago(a,n)==true)
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean Pytago(int a[], int n){
        Arrays.sort(a);
        for(int i=n-1;i>=2;i--){
            int l=0;
            int r=i-1;
            while(l<r){
                if(a[l]+a[r]==a[i])
                    return true;
                else if(a[l]+a[r]<a[i])
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}
