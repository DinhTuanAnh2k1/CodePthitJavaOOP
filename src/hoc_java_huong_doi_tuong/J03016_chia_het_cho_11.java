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
public class J03016_chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = new BigInteger("11");
            BigInteger zero = new BigInteger("0");
            if(a.mod(b).equals(zero)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
