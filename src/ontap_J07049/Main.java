/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07049;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("MUAHANG.in"));
        Map<String,SanPham>sp= new HashMap<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String id = in.nextLine().trim();
            sp.put(id, new SanPham(id,in.nextLine(), Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine())));
            
        }
        ArrayList<KhachHang> kh = new ArrayList<>();
        t = Integer.parseInt(in.nextLine());
        for(int i = 1; i<=t; i++){
            KhachHang q = new KhachHang(i,in.nextLine(),in.nextLine(),sp.get(in.nextLine()),Integer.parseInt(in.nextLine()),in.nextLine());
            kh.add(q);
        }
        Collections.sort(kh);
        for(KhachHang a:kh){
            System.out.println(a);
        }
    }

}
class SanPham{
    private String id, name;
    private int buy, time;

    public SanPham(String id, String name, int buy, int time) {
        this.id = id;
        this.name = name;
        this.buy = buy;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBuy() {
        return buy;
    }

    public int getTime() {
        return time;
    }
    
}
class KhachHang implements Comparable<KhachHang>{
    private String makh, tenkh, diachi, ngayhethan;
    private int soluong;
    private SanPham sp;
    private long sosanhtime;
    
    
    public KhachHang(int index, String tenkh, String diachi, SanPham masp, int soluong, String ngaymua) throws ParseException{
        this.makh = String.format("KH%02d", index);
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sp = masp;
        this.soluong = soluong;
        this.ngayhethan = ngayHetHan(ngaymua);
    }
    private String ngayHetHan(String ngaymua1) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse(ngaymua1);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.MONTH, sp.getTime());
        String tmp = sdf.format(c.getTime());
        this.sosanhtime = c.getTimeInMillis();
        return tmp;
    }
    public String toString(){
        return makh+" "+tenkh+" "+diachi+" "+sp.getId()+" "+(sp.getBuy()*soluong)+" "+ngayhethan;
    }
    

    @Override
    public int compareTo(KhachHang o) {
         //To change body of generated methods, choose Tools | Templates.
        if(this.sosanhtime==o.sosanhtime)
            return this.makh.compareTo(o.makh);
        return this.sosanhtime<o.sosanhtime?-1:1;
    }
}
