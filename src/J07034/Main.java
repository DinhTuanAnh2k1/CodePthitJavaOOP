/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07034;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            MonHoc q = new MonHoc(in.nextLine(),in.nextLine(),in.nextLine());
            dsmh.add(q);
        }
        Collections.sort(dsmh);
        for(MonHoc a: dsmh){
            System.out.println(a);
        }
    }
}
