/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07061_sokhonggiam;

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
        int a[] = new int[100000];
        int b[] = new int[100000];
        for(Integer tmp:ds1){
            a[tmp]++;
        }
        for(Integer tmp:ds2){
            b[tmp]++;
        }
        for(int i=10;i<100000;i++){
            if(a[i]>0 && b[i]>0 && Check(i)){
                System.out.println(i+" "+a[i]+" "+b[i]);
            }
        }
    }
    public static boolean Check(int n){
        String s = String.valueOf(n);
        for(int i=1;i<s.length();i++){
            if((s.charAt(i)-'0')<(s.charAt(i-1)-'0'))
                return false;
        }
        return true;
    }
}
