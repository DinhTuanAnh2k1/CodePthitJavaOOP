/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> pair = (ArrayList<Pair>) in.readObject();
        Collections.sort(pair);
        LinkedHashSet<Pair> ds = new LinkedHashSet<>(pair);
        for(Pair a:ds){
            if(a.getFirst()<a.getSecond()&&gcd(a.getFirst(),a.getSecond())==1)
                System.out.println(a);
        }
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
