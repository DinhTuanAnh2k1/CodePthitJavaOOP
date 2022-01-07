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
public class J03025_xau_doi_xung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            if(checkDoiXung(s))
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean checkDoiXung(String str){
        int n=str.length();
        int count =0;
        if(n%2==1){
            for(int i=0;i<n/2;i++){
                if(str.charAt(i) != str.charAt(n-i-1))
                    count++;
            }
            if(count<=1)
                return true;
        }
        else{
            for(int i=0;i<n/2;i++){
                if(str.charAt(i) != str.charAt(n-i-1))
                    count++;
            }
            if(count==1)
                return true;
        }
        return false;
    }
}
