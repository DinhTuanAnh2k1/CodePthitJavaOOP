/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTong;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long tong = 0;
        while(in.hasNext()){
            String s = in.next();
            try{
                int n = Integer.parseInt(s);
                tong = tong + n;
            }catch(NumberFormatException e){
                
            }
        }
        System.out.println(tong);
    }
}
