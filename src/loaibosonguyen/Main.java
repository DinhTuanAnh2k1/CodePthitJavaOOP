/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaibosonguyen;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> kq = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            try{
                int n = Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                kq.add(s);
            }
        }
        Collections.sort(kq);
        for(String s:kq){
            System.out.print(s+" ");
        }
    }
}
