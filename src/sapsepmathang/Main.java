/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapsepmathang;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MatHang>dsmh=new ArrayList<>();
        Scanner in = new Scanner(new File("MATHANG.in"));
        int t=Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            MatHang q = new MatHang(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dsmh.add(q);
        }
        Collections.sort(dsmh);
        for(MatHang a:dsmh){
            System.out.println(a);
        }
    }
}
