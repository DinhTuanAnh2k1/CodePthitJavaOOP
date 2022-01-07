/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07032_sothuannghichtrongfile;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        int b[]= new int[1000000];
        int c[]= new int[1000000];
        for(Integer tmp : ds1){
            if(tmp<1000000)
                b[tmp]++;
        }
        for(Integer tmp : ds2){
            if(tmp<1000000)
                c[tmp]++;
        }
        int dem=0;
        for(int i = 100; i<1000000;i++){
            if(b[i]>0&&c[i]>0&&isThuanNghich(i)&&isCso(i)){
                System.out.println(i+" "+(b[i]+c[i]));
                dem++;
            }
            if(dem==10){
                break;
            }
        }   
                
    }
    //xet so chu so cos chan hay le
    public static boolean isCso(int n) {
        String s = String.valueOf(n);
        for (Character x : s.toCharArray())
            if (Integer.parseInt(String.valueOf(x)) % 2 == 0)
                return false;
        return s.length() > 1 && s.length() % 2 == 1;
    }
    //xet xem cac chu so co phai deu le khong
    public static boolean isThuanNghich(int n) {
        StringBuilder xau = new StringBuilder();
        String str = String.valueOf(n);
        xau.append(str);
        String check = xau.reverse().toString();
        return str.equals(check);
    }
}
