/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05052_tracuudonhang;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<DonHang> dsdh = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            DonHang q = new DonHang(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()));
            dsdh.add(q);
        }
        for(DonHang a:dsdh){
            System.out.println(a);
        }
    }
}
