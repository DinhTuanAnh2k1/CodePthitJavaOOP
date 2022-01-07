/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05057;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            ThiSinh q = new ThiSinh(in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),
            Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dsts.add(q);
        }
        Collections.sort(dsts);
        
        for(int i=0;i<dsts.size();i++){
            if(dsts.get(i).getDiemtong1()>=24){
                System.out.println(dsts.get(i)+" TRUNG TUYEN");
            }
            else
                System.out.println(dsts.get(i)+" TRUOT");
        }
    }
}
