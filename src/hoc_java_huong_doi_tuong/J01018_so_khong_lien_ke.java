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
public class J01018_so_khong_lien_ke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t  = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            long tong =0;
            for(int i=0; i<s.length(); i++){
                tong+=s.charAt(i)-'0';
            }
            int ktr=1;
            for(int i=0; i<s.length()-1; i++){
                int res=(s.charAt(i+1)-'0')-(s.charAt(i)-'0');
                if(Math.abs(res)!=2){
                    ktr=0;
                    break;
                }
                    
            }
            if(tong%10==0 && ktr==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
