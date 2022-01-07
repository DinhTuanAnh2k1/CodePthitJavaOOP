/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapJ07035;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("SINHVIEN.in"));
        Scanner in2 = new Scanner(new File("MONHOC.in"));
        Scanner in3 = new Scanner(new File("BANGDIEM.in"));
        Map<String,SinhVien>dssv= new HashMap<>();
        Map<String,MonHoc>dsmh= new HashMap<>();
        int t= Integer.parseInt(in1.nextLine());
        while(t-->0){
            String s = in1.nextLine().trim();
            dssv.put(s, new SinhVien(s,in1.nextLine(),in1.nextLine(),in1.nextLine()));
            
        }
        t=Integer.parseInt(in2.nextLine());
        while(t-->0){
            String s = in2.nextLine().trim();
            dsmh.put(s, new MonHoc(s,in2.nextLine(),Integer.parseInt(in2.nextLine())));
        }
        ArrayList<BangDiem>dsbd= new ArrayList<>();
        
        t = Integer.parseInt(in3.nextLine());
        while(t-->0){
            BangDiem q = new BangDiem(dssv.get(in3.next()),dsmh.get(in3.next()),in3.next());
            dsbd.add(q);
        }
        Collections.sort(dsbd);
        t= Integer.parseInt(in3.next());
        while(t-->0){
            String tmp = in3.next();
            for(BangDiem a:dsbd){
                if(tmp.equals(a.getmamon())){
                    System.out.println("BANG DIEM MON "+a.gettenmon()+":");
                    break;
                }
            }
            for(BangDiem a:dsbd){
                if(tmp.equals(a.getmamon())){
                    System.out.println(a);
                }
            }
        }
    }
}
class SinhVien{
    private String ma, name, lop, email;

    public SinhVien(String ma, String name, String lop, String email) {
        this.ma = ma;
        String s[] = name.trim().toLowerCase().split("\\s+");
        //chuan hua xau
        String ans = "";
        for (String x : s)
            ans += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
        this.name = ans;
        this.lop = lop;
        this.email = email;
    }
    public String getmasv(){
        return ma;
    }
    public String gettensv(){
        return name;
    }
    public String getlopsv(){
        return lop;
    }
}
class MonHoc{
    private String ma,name;
    private int tin;

    public MonHoc(String ma, String tenmon, int tin) {
        this.ma = ma;
        this.name = tenmon;
        this.tin = tin;
    }
    public String gettenmon(){
        return name;
    }
    public String getmamon(){
        return ma;
    }
}
class BangDiem implements Comparable<BangDiem>{
    private SinhVien sv;
    private MonHoc mh;
    private float diem1;
    private String diem;

    public BangDiem(SinhVien sv, MonHoc mh, String diem) {
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
        this.diem1= Float.parseFloat(diem);
    }
    public String getmasv(){
        return sv.getmasv();
    }
    public String getmamon(){
        return mh.getmamon();
    }
    public String gettenmon(){
        return mh.gettenmon();
    }
    public String toString(){
        
        return sv.getmasv()+" "+sv.gettensv()+" "+sv.getlopsv()+" "+diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.diem1==o.diem1){
            return sv.getmasv().compareTo(o.getmasv());
        }
        if(this.diem1>o.diem1) return -1;
        return 1;
    }
    
}