/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSet1;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
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
    public String toString(){
        String kq = "";
        for(String s:set){
            kq = kq + s +"\n";
        }
        return kq;
    }
}
