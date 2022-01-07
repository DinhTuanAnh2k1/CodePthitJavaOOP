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
public class J01015_so_tam_phan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-->0){
            int n = in.nextInt();
            
            int dem=0;
            while(n>0){
                int i = n%10;
                if(i==3||i==4||i==5||i==6||i==7||i==8||i==9){
                    dem=1;
                    break;
                }
                n/=10;
            }
            
            if(dem==0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
