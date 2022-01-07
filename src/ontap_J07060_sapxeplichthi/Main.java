/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07060_sapxeplichthi;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in1 = new Scanner(new File("MONTHI.in"));
        Scanner in2 = new Scanner(new File("CATHI.in"));
        Scanner in3 = new Scanner(new File("LICHTHI.in"));
        Map<String,MonThi> dsmt = new HashMap<>();
        Map<String,CaThi> dsct = new HashMap<>();
        int t = Integer.parseInt(in1.nextLine());
        while(t-->0){
            String s = in1.nextLine().trim();
            dsmt.put(s, new MonThi(s,in1.nextLine(),in1.nextLine()));
        }
        t=Integer.parseInt(in2.nextLine());
        for(int i=1;i<=t;i++){
            String s = String.format("C%03d", i);
            dsct.put(s, new CaThi(s,in2.nextLine(),in2.nextLine(),in2.nextLine()));
        }
        ArrayList<LichThi> dslt = new ArrayList<>();
        t = Integer.parseInt(in3.nextLine());
        while(t-->0){
            LichThi q = new LichThi(dsct.get(in3.next()), dsmt.get(in3.next()),(in3.next()),(in3.next()));
            dslt.add(q);
        }
        Collections.sort(dslt);
        for(LichThi a : dslt){
            System.out.println(a);
        }
    }
}
class MonThi{
    private String id, name, hinhthuc;

    public MonThi(String id, String name, String hinhthuc) {
        this.id = id;
        this.name = name;
        this.hinhthuc = hinhthuc;
    }

    public String getName() {
        return name;
    }
    
}
class CaThi{
    private String id,phong;
    private Date ngaythi, giothi;
    public CaThi(String id,String ngaythi, String giothi, String phong) throws ParseException{
        this.id = id;
        this.ngaythi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythi);
        this.giothi = new SimpleDateFormat("HH:mm").parse(giothi);
        this.phong = phong;
    }

    public String getPhong() {
        return phong;
    }

    public Date getNgaythi() {
        return ngaythi;
    }

    public Date getGiothi() {
        return giothi;
    }
    
}
class LichThi implements Comparable<LichThi>{
    private CaThi ct;
    private MonThi mt;
    private String nhom,soluong;

    public LichThi(CaThi ct, MonThi mt, String nhom, String soluong) {
        this.ct = ct;
        this.mt = mt;
        this.nhom = nhom;
        this.soluong = soluong;
    }
    public Date getngaythi(){
        return ct.getNgaythi();
    }
    public Date getgiothi(){
        return ct.getGiothi();
    }
    @Override
    public int compareTo(LichThi o) {
        if(this.ct.getNgaythi().compareTo(o.ct.getNgaythi())==0){
            return this.ct.getGiothi().compareTo(o.ct.getGiothi());
        }
        return this.ct.getNgaythi().compareTo(o.ct.getNgaythi());
    }
    @Override
    public String toString(){
        return (String.format("%s", new SimpleDateFormat("dd/MM/yyyy").format(ct.getNgaythi())))+" "+(String.format("%s", new SimpleDateFormat("HH:mm").format(ct.getGiothi())))+" "+ct.getPhong()+" "+mt.getName()+" "+nhom+" "+soluong;
    }
}
