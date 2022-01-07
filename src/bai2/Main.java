/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src\\bai2\\in.txt"));
        long tu1 = in.nextInt();
        long mau1 = in.nextInt();
        long tu2 = in.nextInt();
        long mau2 = in.nextInt();
        System.out.println("phan so 1: "+tu1+"/"+mau1);
        System.out.println("phan so 2: "+tu2+"/"+mau2);
        long tutong = tu1*mau2+tu2*mau1;
        long mautong = mau1*mau2;
        long tutich = tu1*tu2;
        long mautich = mau1*mau2;
        
        long x1 = usc(tutong,mautong);
        long x2 = usc(tutich,mautich);
        tutong = tutong/x1;
        mautong = mautong/x1;
        tutich = tutich/x2;
        mautich = mautich/x2;
        System.out.println("tong 2 phan so: "+tutong+"/"+mautong);
        System.out.println("tich 2 phan so: "+tutich+"/"+mautich);
        try{
            Formatter f = new Formatter("src\\bai2\\out.txt");
            f.format("%d %d\n%d %d", tutong, mautong,tutich,mautich);
            f.close();
        }catch(Exception e){
            
        }
    }
    public static long usc(long a, long b){
        while(b>0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    
}
