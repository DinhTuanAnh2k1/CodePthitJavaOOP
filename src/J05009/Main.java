/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ThuKhoa> dstk=new ArrayList<>();
        int t=Integer.parseInt(in.nextLine());
        for(int i=1; i<=t;i++){
            ThuKhoa q = new ThuKhoa(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),
            Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            dstk.add(q);
        }
        Collections.sort(dstk);
        float res=dstk.get(0).getTong();
        
        for(int i=0;i<dstk.size();i++){
            if(dstk.get(i).getTong()==res){
                System.out.println(dstk.get(i));
            }
        }
    }
    
}
