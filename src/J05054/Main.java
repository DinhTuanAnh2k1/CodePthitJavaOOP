/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<HocSinh>dshs=new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int tt=1;
        for(int i=1;i<=t;i++){
            HocSinh q = new HocSinh(i,in.nextLine(),Float.parseFloat(in.nextLine()));
            dshs.add(q);
        }
        Collections.sort(dshs);
        int dem=0;
        float d = -1;
        ArrayList<XepHang>dsxh=new ArrayList<>();
        for(HocSinh x:dshs){
            String tmp="";
            if(x.getDiem()!=d){
                d=x.getDiem();
                tmp=(x+" "+tt);
                
                dem=tt;
                tt++;
            }
            else{
                tmp=(x+" "+dem);
                tt++;
            }
            XepHang q = new XepHang(tmp,x.getMa());
            dsxh.add(q);
        }
        Collections.sort(dsxh);
        for(XepHang x:dsxh){
            System.out.println(x);
        }
    }
}
