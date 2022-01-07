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
public class J03038_danhdauchucai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int m=0,c=0;
        HashMap<String,Integer> n = new HashMap<String,Integer>();
        for(int i = 0; i<s.length(); i++){
            String res=s.charAt(i)+"";
            if(!n.containsKey(res)){
                m++; 
                c=1;
            }
            else{
                c=n.get(res)+1;
            }
            n.put(res,c);
        }
        System.out.println(m);
    }
}
