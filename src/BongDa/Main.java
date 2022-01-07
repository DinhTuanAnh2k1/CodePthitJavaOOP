/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BongDa;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<CauLacBo>ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            CauLacBo q = new CauLacBo(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            ds.add(q);
        }
        int test = Integer.parseInt(in.nextLine());
        ArrayList<DoanhThu> kq = new ArrayList<>();
        while(test-->0){
            DoanhThu d = new DoanhThu(in.nextLine());
            kq.add(d);
        }
        ArrayList<Sort> inra=new ArrayList<>();
        for(int i=0; i<kq.size(); i++){
            String res ="";
            res=(kq.get(i)+" ");
            String ma = kq.get(i).getMaclb();
            for(int j=0; j<ds.size(); j++){
                if(ma.equals(ds.get(j).getMa())){
                    int money=0;
                    money= (kq.get(i).getSoluong())*(ds.get(j).getGiave());
                    res+=(ds.get(j));
                    Sort trave = new Sort(res,money);
                    trave.compareTo(trave);
                    inra.add(trave);
                }
            }
            
        }
        Collections.sort(inra);
        for(Sort m:inra){
            System.out.println(m);
        }
    }
}
