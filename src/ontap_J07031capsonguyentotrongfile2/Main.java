/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07031capsonguyentotrongfile2;

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
        ArrayList<Integer> ds1 =  (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ds2 =  (ArrayList<Integer>) in2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<>();
        for(Integer tmp:ds1){
            set1.add(tmp);
        }
        for(Integer tmp:ds2){
            set2.add(tmp);
        }
        for(Integer tmp:set1){
            if(!set2.contains(tmp)){
                set3.add(tmp);
            }
        }
        for(Integer tmp : set3){
            if(set3.contains(1000000-tmp) && isPrime(1000000-tmp) && isPrime(tmp) && (tmp<500000)){
                System.out.println(tmp+" "+(1000000-tmp));
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
}
