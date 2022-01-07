/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05040_lapbangtinhcong;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<TinhCong>dstc = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            TinhCong q = new TinhCong(i,in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()),in.nextLine());
            dstc.add(q);
        }
        for(TinhCong a:dstc){
            System.out.println(a);
        }
    }
}
