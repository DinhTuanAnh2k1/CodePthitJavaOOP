
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07047;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("DATA.in"));
        Map<String,Phong> dsp = new HashMap<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s[] = in.nextLine().trim().split(" ");
            dsp.put(s[0], new Phong(s[0],s[1],Float.parseFloat(s[2]),Float.parseFloat(s[3])));
            
        }
        ArrayList<Khach>dsk=new ArrayList<>();
        t = Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            String hoten = in.nextLine();
            String phong = in.nextLine(); 
            String den = in.nextLine();
            String di = in.nextLine();
            Khach q = new Khach(i,hoten,phong,den,di,dsp.get(phong.substring(2,3)));
            dsk.add(q);
        }
        Collections.sort(dsk);
        for(Khach a : dsk){
            System.out.println(a);
        }
        
    }
}
class Phong{
    private String id, name;
    private float dongia, phiphucvu;

    public Phong(String id, String name, float dongia, float phiphucvu) {
        this.id = id;
        this.name = name;
        this.dongia = dongia;
        this.phiphucvu = phiphucvu;
    }

    public String getId() {
        return id;
    }

    public float getDongia() {
        return dongia;
    }

    public float getPhiphucvu() {
        return phiphucvu;
    }
    
    
}
class Khach implements Comparable<Khach>{
    private String makh, hoten, maphong;
    private Date ngayden, ngaydi;
    private Phong id;
    private float thanhtoan;
    private long time;
    public Khach(int index, String hoten, String maphong, String ngayden, String ngaydi, Phong id) throws ParseException{
        this.makh = String.format("KH%02d", index);
        this.hoten = hoten;
        this.id = id;
        this.maphong = maphong;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        long tmp = (this.ngaydi.getTime()-this.ngayden.getTime())/(1000*60*60*24);
        this.time = tmp;
        this.thanhtoan = thanhToan();
    }
     
    private float thanhToan(){
        long res=0;
        if(time==0){
            res=1;
        }
        else{
            res=time;
        }
        float tienphong = res*id.getDongia();
        float phiphucvu=tienphong*id.getPhiphucvu();
        float tong=0;
        if(res<10){
            tong = tienphong+phiphucvu;
        }
        else if(res>=10&&res<20)
            tong = (tienphong+phiphucvu)*98/100;
        else if(res>=20&&res<30)
            tong = (tienphong+phiphucvu)*96/100;
        else
            tong = (tienphong+phiphucvu)*94/100;
        return (tong);
    }

    @Override
    public int compareTo(Khach o) {
        //To change body of generated methods, choose Tools | Templates.
        if(time<o.time) return 1;
        if(time>o.time) return -1;
        return 0;
    }
    public String toString(){
        return makh+" "+hoten+" "+maphong+" "+time+" "+String.format("%.2f", thanhtoan);
    }
    
}