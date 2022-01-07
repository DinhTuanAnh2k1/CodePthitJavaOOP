/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DANHSACHMONTHI;

/**
 *
 * @author Mr Hieu
 */
import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> dsmt= new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            MonThi q = new MonThi(in.nextLine(),in.nextLine(),in.nextLine());
            dsmt.add(q);
        }
        Collections.sort(dsmt);
        for(MonThi a:dsmt){
            System.out.println(a);
        }
    }
}
