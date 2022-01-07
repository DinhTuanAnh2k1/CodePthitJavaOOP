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
public class J01010_cat_doi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int ktr=1;
            for(int i=0; i<s.length(); i++){
                if(catDoi(s.charAt(i))==2){
                    ktr=0;
                    break;
                }
            }
            int ktr1=0;
            for(int i=0; i<s.length(); i++){
                if(catDoi(s.charAt(i))==1){
                    ktr1=1;
                    break;
                }
            }
            if(ktr==0||ktr1==0){
                System.out.print("INVALID");
            }
            else{
                int k=0;
                for(int i=0; i<s.length(); i++){
                    if(catDoi(s.charAt(i))==1){
                        System.out.print("1");
                        k=i;
                        break;
                    }
                }
                for(int i=k+1; i<s.length(); i++){
                    if((catDoi(s.charAt(i))==1)){
                        System.out.print("1");
                    }
                    if(catDoi(s.charAt(i))==0){
                        System.out.print("0");
                    }
                }
            }System.out.println("");
        }
    }
    public static int catDoi(char n){
        if(n=='8'||n=='9'||n=='0'){
            return 0;
        }
        if(n=='1'){
            return 1;
        }
        return 2;
    }
}
