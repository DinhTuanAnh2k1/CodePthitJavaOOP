/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07015;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class Main_nguyen_to_trong_file {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        int dem1[] = new int[10000];
        for(Integer n : ds1) dem1[n]++;
        for(int i=0; i<10000; i++){
            if(dem1[i]>0 && ngto(i)==1){
                System.out.println(i+" "+dem1[i]);
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
}
