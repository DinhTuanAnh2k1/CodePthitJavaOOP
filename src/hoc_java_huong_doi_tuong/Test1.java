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
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        String tmp = s.substring(0, 1);
        String res = s.substring(1, s.length());
        tmp = tmp.toUpperCase();
        s=tmp+res;
        System.out.println(s);
    }
}
