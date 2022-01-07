/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentovathuannghich2filenhiphan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        int dem1[] = new int[10000];
        int dem2[] = new int[10000];
        for(Integer n : ds1) dem1[n]++;
        for(Integer n : ds2) dem2[n]++;
        for(int i=0; i<10000; i++){
            if(dem1[i]>0 && dem2[i]>0 && ngto(i)==1 && thuanNghich(i)==1){
                System.out.println(i + " " + dem1[i] + " " + dem2[i]);
            }
        }
    }
    public static int ngto(int n){
        if(n<2) return 0;
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0)
                    return 0;
            }
        }
        return 1;
    }
    public static int thuanNghich(int n){
        int res = n;
        int i=0;
        while(n>0){
            i=i*10+n%10;
            n=n/10;
        }
        if(res==i)
            return 1;
        return 0;
    }
}
