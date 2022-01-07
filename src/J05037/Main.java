/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05037;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<GiaBan>dsgb = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            GiaBan q = new GiaBan(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            dsgb.add(q);
        }
        Collections.sort(dsgb);
        for(GiaBan a:dsgb){
            System.out.println(a);
        }
    }
}
