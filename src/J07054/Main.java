/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem>dsbd = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t; i++){
            BangDiem q = new BangDiem(i,in.nextLine(),Float.parseFloat(in.nextLine()),
            Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dsbd.add(q);
        }
        Collections.sort(dsbd);
        int res=0;
        int dem=0;
        float diem=-1;
        for(int i=0; i<dsbd.size();i++){
            if(dsbd.get(i).getTb()!=diem){
                res+=1;
                System.out.println(dsbd.get(i)+" "+res);
                diem=dsbd.get(i).getTb();
                dem=res;
            }
            else{
                System.out.println(dsbd.get(i)+" "+dem);
                res+=1;
            }
        }
    }
}
