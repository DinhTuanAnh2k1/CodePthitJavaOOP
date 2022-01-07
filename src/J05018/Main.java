/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05018;

/**
 *
 * @author Admin
 */
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        ArrayList<HocSinh>ds=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            HocSinh q = new HocSinh(i,in.nextLine(), in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(HocSinh a : ds){
            System.out.println(a);
        }
    }
}
