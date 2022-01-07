/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        ArrayList<GioChuan> dsgc = new ArrayList<>();
        Scanner in = new Scanner(System.in); 
        
        int t1 = Integer.parseInt(in.nextLine());
        while(t1-->0){
            MonHoc q = new MonHoc(in.nextLine());
            dsmh.add(q);
        }
        int t2 = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t2; i++){
            GiangVien q = new GiangVien(in.nextLine());
            dsgv.add(q);
        }
        int t3 = Integer.parseInt(in.nextLine());
        while(t3-->0){
            GioChuan q = new GioChuan(in.nextLine());
            dsgc.add(q);
        }
        for(int i=0;i<dsgv.size();i++){
            String magv=dsgv.get(i).getMagv();
            float giotong=0;
            for(int j=0;j<dsgc.size();j++){
                if(magv.equals(dsgc.get(j).getMa()))
                    giotong+=dsgc.get(j).getGio();
            }
            System.out.print(dsgv.get(i).getHoten()+" ");
            System.out.printf("%.2f\n",giotong);
        }
    }    
}
