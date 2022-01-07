/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<DoanhNghiep> dsdn = new ArrayList<>();
        Scanner in = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            DoanhNghiep q = new DoanhNghiep(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
            dsdn.add(q);
        }
        Collections.sort(dsdn);
        for(DoanhNghiep a : dsdn){
            System.out.println(a);
        }
    }
}
