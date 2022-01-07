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
public class J03008_So_dep_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int ktr1=1, ktr2=1;
            int l = s.length()-1;
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i)-'0') != (s.charAt(l-i)-'0')) ktr1=0;
            }
            for(int i=0; i<s.length(); i++){
                int a = s.charAt(i)-'0';
                if(ngTo(a)==0) ktr2=0;
            }
            if(ktr1==1 && ktr2==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static int ngTo(int n){
        if(n<2) return 0;
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0) return 0;
            }
        }
        return 1;
    }
}
