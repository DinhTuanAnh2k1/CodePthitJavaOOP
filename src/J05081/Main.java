/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            MatHang q = new MatHang(i,in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(MatHang a:ds){
            System.out.println(a);
        }
    }
}
