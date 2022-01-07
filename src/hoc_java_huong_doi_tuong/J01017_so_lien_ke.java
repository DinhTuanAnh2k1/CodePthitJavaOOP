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
public class J01017_so_lien_ke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int ktr=1;
            for(int i=0; i<s.length()-1; i++){
                int res=(s.charAt(i+1)-'0')-(s.charAt(i)-'0');
                if(Math.abs(res)!=1)
                {
                    ktr=0;
                    break;
                }
            }
            if(ktr==1){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
   
}
