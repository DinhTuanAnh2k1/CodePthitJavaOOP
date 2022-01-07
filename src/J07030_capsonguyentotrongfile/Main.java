/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07030_capsonguyentotrongfile;

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
        int a[] = new int[1000000];
        for (Integer x : ds1)
            if (x < 500000)
                a[x]++;
        for (Integer x : ds2)
            if (x > 500000)
                a[x]++;
        for (int i = 2; i < 500000; i++)
            if (isPrime(i) && a[i] > 0) {
                int ans = 1000000 - i;
                if (isPrime(ans) && a[ans] > 0)
                    System.out.println(i + " " + ans);
            }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
}

