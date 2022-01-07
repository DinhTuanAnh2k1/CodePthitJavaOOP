/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05020;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien>ds=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            SinhVien q = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(SinhVien a:ds){
            System.out.println(a);
        }
    }
}
