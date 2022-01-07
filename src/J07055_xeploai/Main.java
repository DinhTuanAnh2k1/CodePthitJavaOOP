/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07055_xeploai;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> dsbd = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            BangDiem q = new BangDiem(i,in.nextLine(),Float.parseFloat(in.nextLine()),
            Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dsbd.add(q);
        }
        Collections.sort(dsbd);
        for(BangDiem a : dsbd){
            System.out.println(a);
        }
    }
}
