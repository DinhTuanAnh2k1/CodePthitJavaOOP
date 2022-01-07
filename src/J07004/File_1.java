/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07004;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class File_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int a[] = new int[1000];
        while(in.hasNextInt()){
            a[in.nextInt()]++;
        }
        for(int i=0; i<1000; i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
