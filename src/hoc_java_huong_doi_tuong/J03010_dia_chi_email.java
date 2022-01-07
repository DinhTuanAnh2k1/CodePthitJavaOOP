/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03010_dia_chi_email {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> dem = new HashMap<String,Integer>();
        while(t-->0){
            String str;
            str = in.nextLine();
            str = str.toLowerCase();
            str = str.trim();
            str = str.replaceAll("\\s+", " ");
            str.split(" ");
            String cuoi = "";
            int k = 0, res=0;
            for(int j=str.length()-1; j>0; j--){
                if(str.charAt(j)==' ') {
                    k=j;
                    break;
                }
            }
            for(int j=k+1; j<str.length(); j++) cuoi+=str.charAt(j);
            cuoi += str.charAt(0);
            for(int i=0;  i<k; i++){
                if(str.charAt(i) == ' '){
                    cuoi += str.charAt(i+1);
                }
            }
            if(!dem.containsKey(cuoi)) res=1;
            else res = dem.get(cuoi)+1;
            dem.put(cuoi, res);
            if(res>1) cuoi+=Integer.toString(res);
            System.out.println(cuoi+"@ptit.edu.vn");
            
        }
    }
}
