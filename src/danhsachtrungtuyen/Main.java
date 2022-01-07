/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachtrungtuyen;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            ThiSinh q = new ThiSinh(in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),
            Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dsts.add(q);
        }
        Collections.sort(dsts);
        int t1=in.nextInt();
        int dem=0;
        float diemchuan = dsts.get(t1-1).getDiemtong();
        for(int i=t1; i<dsts.size();i++){
            if(diemchuan!=dsts.get(i).getDiemtong()){
                dem=i-1;
                break;
            }
        }
        System.out.printf("%.1f\n",diemchuan);
        for(int i=0;i<dsts.size();i++){
            if(i<dem+1){
                System.out.println(dsts.get(i)+" TRUNG TUYEN");
            }
            else
                System.out.println(dsts.get(i)+" TRUOT");
        }
    }
}
