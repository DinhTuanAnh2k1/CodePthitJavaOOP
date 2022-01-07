/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07029_songuyentolonnhattrongfilenhiphan;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        int a[] = new int[1000000];
        for (Integer x : ds1)
            if (x < 1000000)
                a[x]++;
        int dem=0;
        for (int i = 1000000-1; i >=2; i--)
            if (isPrime(i) && a[i] > 0){
                dem++;
                System.out.println(i+" "+a[i]);
                if(dem==10)
                    break;
            }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
}
