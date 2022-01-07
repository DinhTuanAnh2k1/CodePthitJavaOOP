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

public class J02020_liet_ke_to_hop_1 {
    private int i, n, k, a[];
    public void Init(){
        Scanner in = new Scanner(System.in);
        do{
            this.n = in.nextInt();
            this.k = in.nextInt();
        }while(this.n<0||this.k>this.n);
        a = new int[n+1];
        for(int j = 1; j<= this.k; j++) a[j]=j;
    }
    //hien thi
    public void Res(){
        for(int j=1; j<=k; j++){
            System.out.print(a[j]);
        }
        System.out.print(" ");
    }
    //sinh to hop
    public void sinhToHop(){
        int dem=1;
        do{
            Res();
            this.i = this.k;
            while(this.i>0 && a[i]==this.n - this.k+i) i--;
            if(this.i>0){
                a[i]++;
                for(int j = i+1; j<=this.k; j++){
                    a[j]=a[j-1]+1;
                }
                dem++;
            }
        }while(this.i != 0);
        System.out.println("");
        System.out.println("Tong cong co "+dem+" to hop");
    }
    public static void main(String[] args) {
        J02020_liet_ke_to_hop_1 tohop = new J02020_liet_ke_to_hop_1();
        tohop.Init();
        tohop.sinhToHop();
        System.gc();
        
    }
    
}
