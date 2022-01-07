/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoaii2;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<MaVung>ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        
        int t= Integer.parseInt(in.nextLine());
        while(t-->0){
            MaVung q = new MaVung(Integer.parseInt(in.nextLine()), in.nextLine(), Integer.parseInt(in.nextLine()));
            ds.add(q);
        }
        int test = Integer.parseInt(in.nextLine());
        ArrayList <TinhTien> cuocgoi= new ArrayList<>();
        while(test-->0){
            String so=in.nextLine();
            TinhTien k = new TinhTien(so);
            cuocgoi.add(k);
        }
        ArrayList<Sort>ketqua=new ArrayList<>();
        for(int i=0; i<cuocgoi.size(); i++){
            String dem = cuocgoi.get(i).getSo();
            int dau=dem.charAt(0)-'0';
            int an = 0;
            an = an*10+dem.charAt(1)-'0';
            an = an*10+dem.charAt(2)-'0';
            
            if(dau!=0){       
                int tiendong =0;
                tiendong = cuocgoi.get(i).getSophut()*800;
                String anh=(dem+" "+ "Noi mang"+ " "+ cuocgoi.get(i).getSophut()+ " "+ tiendong);
                Sort tinh = new Sort(anh);
                tinh.compareTo(tinh);
                ketqua.add(tinh);
            }
            else{
                for(int j=0; j<ds.size(); j++){
                    if(an==ds.get(j).getMavung()){
                        int tiendong =0;
                        tiendong = cuocgoi.get(i).getSophut()*ds.get(j).getGia();
                        String anh =(dem+" "+ds.get(j)+" "+cuocgoi.get(i).getSophut()+" "+tiendong);
                        Sort na = new Sort(anh);
                        na.compareTo(na);
                        ketqua.add(na);
                    }     
                }
            }  
            
        }
        Collections.sort(ketqua);
            for(Sort l : ketqua){
                System.out.println(l);
        }
    }
}
