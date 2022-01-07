/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xettuyen;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        ArrayList<XetTuyen>dsxt=new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            XetTuyen q = new XetTuyen(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dsxt.add(q);
        }
        for(XetTuyen a:dsxt){
            System.out.println(a);
        }
    }
}
