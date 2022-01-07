/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07016_nguyentotrongfilenhiphan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Mr Hieu
 */
public class Number {
    private TreeSet<Integer> set = new TreeSet<>();
    public Number(){
        
    }
    public Number(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));
        while(in.hasNext()){
            set.add(in.nextInt());
        }
    }

    @Override
    public String toString() {
        String kq = "";
        for(Integer s:set){
            kq = kq + s + " ";
        }
        return kq;
    }
    public Number union(Number other){
        Number uni = new Number();
        uni.set.addAll(set);
        uni.set.addAll(other.set);
        return uni;
    }
}
