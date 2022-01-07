/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057_diemtuyensinh;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh>dsts=new ArrayList<>();
        int t=Integer.parseInt(in.nextLine());
        for(int i=1; i<=t;i++){
            ThiSinh q = new ThiSinh(i,in.nextLine(),Float.parseFloat(in.nextLine()),in.nextLine(), in.nextLine());
            dsts.add(q);
        }
        Collections.sort(dsts);
        for(ThiSinh a:dsts){
            System.out.println(a);
        }
    }
}
