/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06004;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<Nhom> dsbt = new ArrayList<>();
        int t1=in.nextInt();
        int t2=in.nextInt();
        in.nextLine();
        while(t1-->0){
            SinhVien q = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            q.compareTo(q);
            dssv.add(q);
            
        }
        Collections.sort(dssv);
        //int t3 = Integer.parseInt(in.nextLine());
        for(int i=1; i<=t2; i++){
            String res = in.nextLine();
            //System.out.println(res);
            Nhom a = new Nhom(i,res);           
            dsbt.add(a);
        }
        for(int i=0; i<dssv.size(); i++){
            for(int j=0; j<dsbt.size(); j++){
                if(dssv.get(i).getNhom()==dsbt.get(j).getNhombt()){
                    System.out.println(dssv.get(i)+" "+dsbt.get(j));
                }
            }
        }
    }
}
