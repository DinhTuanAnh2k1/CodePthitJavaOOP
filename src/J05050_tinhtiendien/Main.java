/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05050_tinhtiendien;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<TienDien> dstd = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            TienDien q = new TienDien(i,in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            dstd.add(q);
        }
        for(TienDien a:dstd){
            System.out.println(a);
        }
    }
}
