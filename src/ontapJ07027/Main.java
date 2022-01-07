/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontapJ07027;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1=new Scanner(new File("SINHVIEN.in"));
        Scanner in2=new Scanner(new File("BAITAP.in"));
        Scanner in3=new Scanner(new File("NHOM.in"));
        Map<String,SinhVien> dssv = new HashMap<>();
        Map<Integer,BaiTap> dsbt = new HashMap<>();
        ArrayList<Nhom> dsn = new ArrayList<>();
        int t1 = Integer.parseInt(in1.nextLine());
        while(t1-->0){
            String s = in1.nextLine().trim();
            dssv.put(s, new SinhVien(s,in1.nextLine(),in1.nextLine()));
        }
        int t2 = Integer.parseInt(in2.nextLine());
        for(int i=1;i<=t2;i++){
            String s = in2.nextLine().trim();
            dsbt.put(i, new BaiTap(i,s));
        }
        while(in3.hasNext()){
            StringTokenizer st = new StringTokenizer(in3.nextLine());
            dsn.add(new Nhom(dssv.get(st.nextToken()),dsbt.get(Integer.parseInt(st.nextToken()))));
        }
        Collections.sort(dsn);
        for(Nhom a:dsn){
            System.out.println(a);
        }
    }
}
class SinhVien{
    private String id, name, phone;

    public SinhVien(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public String getmasv(){
        return id;
    }
    public String gettensv(){
        return name;
    }
    public String getsodt(){
        return phone;
    }
}
class BaiTap{
    private int id;
    private String name;
    
    public BaiTap(int index, String name){
        this.id = index;
        this.name = name;
    }
    public int getmamon(){
        return id;
    }
    public String gettenmon(){
        return name;
    } 
}
class Nhom implements Comparable<Nhom>{
    private SinhVien sv;
    private BaiTap bt;
    public Nhom(SinhVien id, BaiTap nhombt){
        this.sv = id;
        this.bt = nhombt;
    }
    public String getmasv(){
        return sv.getmasv();
    }
    
    public String toString(){
        return sv.getmasv()+" "+sv.gettensv()+" "+sv.getsodt()+" "+bt.getmamon()+" "+bt.gettenmon();
    }

    @Override
    public int compareTo(Nhom o) {
        return sv.getmasv().compareTo(o.getmasv());
    }
    
}