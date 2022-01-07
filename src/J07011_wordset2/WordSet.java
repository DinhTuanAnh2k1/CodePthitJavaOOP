/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07011_wordset2;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(){
        
    }
    public WordSet(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));
        while(in.hasNext()){
            set.add(in.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String kq = "";
        for(String s:set){
            kq = kq + s + " ";
        }
        return kq;
    }
    public WordSet union(WordSet other){
        WordSet uni = new WordSet();
        uni.set.addAll(set);
        uni.set.addAll(other.set);
        return uni;
    }
    public WordSet intersection(WordSet other){
        WordSet inter = new WordSet();
        inter.set.addAll(set);
        inter.set.retainAll(other.set);
        return inter;
    }
}
