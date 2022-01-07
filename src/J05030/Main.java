/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05030;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<BangDiem> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            BangDiem q = new BangDiem(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        int i=1;
        for(BangDiem a:ds){
            System.out.println(i+" "+a);
            i++;
        }
    }
}
