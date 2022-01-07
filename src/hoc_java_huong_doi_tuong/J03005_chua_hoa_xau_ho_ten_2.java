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
public class J03005_chua_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String str = in.nextLine();
            str = str.toLowerCase();
            str = str.trim();
            str = str.replaceAll("\\s+", " ");
            String tmp[] = str.split(" ");
            str = "";
            for(int i=0; i<tmp.length; i++){
                str += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if(i<tmp.length-1) str += " ";
            }
            if(str.charAt(str.length()-1) == ' ') str += "\b";
            String res = "";
            String kq = "";
            int k = 0;
            for(int j=0; j<str.length(); j++){
                
                if(str.charAt(j) == ' '){
                    k = j;
                    break;
                }
                kq += str.charAt(j);
            }
            for(int j = k+1; j<str.length(); j++){
                res += str.charAt(j);
            }
            kq = kq.toUpperCase();
            System.out.println(res + ", " + kq);
        }
    }
}
