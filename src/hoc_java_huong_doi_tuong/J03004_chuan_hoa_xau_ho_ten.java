/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

/**
 *
 * @author Admin
 */
import java.util.*;
public class J03004_chuan_hoa_xau_ho_ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String str;
            str = in.nextLine();
            str = str.toLowerCase();
            str = str.trim();
            str = str.replaceAll("\\s+", " ");
            String tmp[] = str.split(" ");
            str = "";
            for(int i = 0; i < tmp.length; i++){
                str += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if(i<tmp.length-1)
                    str += " ";
            }
            if(str.charAt(str.length()-1)==' ') str+="\b";
            System.out.println(str);
        }
    }
}
