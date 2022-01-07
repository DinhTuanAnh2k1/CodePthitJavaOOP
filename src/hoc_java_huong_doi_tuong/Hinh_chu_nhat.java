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

public class Hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b= in.nextInt();
        if(a<=0 || b<=0) System.out.println(0);
        else
            System.out.println((a+b)*2 + " " + a*b);
    }
        
}
