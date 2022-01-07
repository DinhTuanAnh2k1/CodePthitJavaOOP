/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<XepHang>dsxh=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        while(t-->0){
            XepHang q = new XepHang(in.nextLine(),in.nextLine());
            dsxh.add(q);
            
        }
        Collections.sort(dsxh);
        for(XepHang a:dsxh){
            System.out.println(a);
        }
    }
}
