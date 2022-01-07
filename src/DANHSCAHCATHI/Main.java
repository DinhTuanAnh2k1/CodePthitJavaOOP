/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSCAHCATHI;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi>dsct=new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            CaThi q = new CaThi(i,in.nextLine(),in.nextLine(),in.nextLine());
            dsct.add(q);
            
        }
        Collections.sort(dsct);
        for(CaThi a:dsct){
            System.out.println(a);
        }
    }
}
