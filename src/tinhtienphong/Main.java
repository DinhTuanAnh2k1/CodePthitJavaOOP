/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtienphong;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang>dskh= new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            KhachHang q = new KhachHang(i,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
            dskh.add(q);
        }
        Collections.sort(dskh);
        for(KhachHang a:dskh){
            System.out.println(a);
        }
    }
}
