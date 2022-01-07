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
public class J01016_chuso4_va7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            String s = in.nextLine();
            int dem=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='4'||s.charAt(i)=='7'){
                    dem+=1;
                }
            }
            if(dem==4||dem==7){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
