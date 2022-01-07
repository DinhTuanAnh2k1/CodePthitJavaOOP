/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxeplichthi;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("MONTHI.in"));
        ArrayList<MonThi>dsmt=new ArrayList<>();
        ArrayList<CaThi>dsct=new ArrayList<>();
        ArrayList<LichThi>dslt=new ArrayList<>();
        ArrayList<SapXep>dssx=new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            MonThi q = new MonThi(in.nextLine(),in.nextLine(),in.nextLine());
            dsmt.add(q);
        }
        in=new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            CaThi q = new CaThi(i,in.nextLine(),in.nextLine(),in.nextLine());
            dsct.add(q);    
        }
        in= new Scanner(new File("LICHTHI.in"));
        t = Integer.parseInt(in.nextLine());
        while(t-->0){
            LichThi q = new LichThi(in.next(),in.next(),in.nextInt(),in.nextInt());
            dslt.add(q);
        }
        for(LichThi x:dslt){
            String maca, mamon, phong="", tenmon="";
            int nhom,soluong,gio=0,phut=0;
            String thoigian="";
            maca=x.getMamon();
            mamon=x.getMamon();
            soluong=x.getSosv();
            nhom=x.getManhom();
            for(CaThi y:dsct){
                if(maca.equals(y.getMa())){
                    phong = y.getPhong();
                    thoigian=y.getNgaythi()+"";
                    gio=y.getGio();
                    phut=y.getPhut();
                }
            }
            for(MonThi z:dsmt){
                if(mamon.equals(z.getMa()))
                    tenmon=z.getTen();
            }
            SapXep q = new SapXep(maca,mamon,thoigian,gio,phut,phong,tenmon,nhom,soluong);
            dssx.add(q);
        }
        Collections.sort(dssx);
        for(SapXep v:dssx){
            System.out.println(v);
        }
    }
}
