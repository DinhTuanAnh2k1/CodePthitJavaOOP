/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03013_Hieu_2_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s1 = in.next(), s2 = in.next();
            int n1 = s1.length(), n2 = s2.length(), n = Math.max(n1, n2);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger kq = a.subtract(b).abs();
            int c = kq.toString().length();
            for(int i=0; i<n-c; i++){
                System.out.print("0");
            }
            System.out.println(kq);
        }
    }
}
