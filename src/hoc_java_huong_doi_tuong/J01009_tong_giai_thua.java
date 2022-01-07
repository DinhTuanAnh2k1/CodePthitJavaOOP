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
public class J01009_tong_giai_thua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum=0;
        long res=1;
        for(int i=1; i<=n; i++){
            res=res*i;
            sum+=res;
        }
        System.out.println(sum);
    }
}
