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
public class J03032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s+=' ';
            String kq="";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==' '){
                    StringBuilder str = new StringBuilder(kq);
                    System.out.print(str.reverse()+" ");
                    kq="";
                }
                else{
                    kq+=s.charAt(i);
                }
            }
            System.out.println("");
        }
    }
}
