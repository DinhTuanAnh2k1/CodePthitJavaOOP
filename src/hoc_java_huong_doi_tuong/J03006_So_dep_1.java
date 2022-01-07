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
public class J03006_So_dep_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int ktr=1, test=1;
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i)-'0')%2==1) ktr=0;
            }
            int l = s.length()-1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!=s.charAt(l-i)) test=0;
            }
            if(test==1&&ktr==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
