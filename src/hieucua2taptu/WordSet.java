/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieucua2taptu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(){
        
    }
    public WordSet(String name) throws FileNotFoundException{
        Scanner in = new Scanner(new File(name));
        while(in.hasNextLine()){
            String s = in.nextLine();
            StringTokenizer st = new StringTokenizer(s.toLowerCase());
            while(st.hasMoreElements()) set.add(st.nextToken());
        }
        in.close();
    }
    public String toString(){
        String kq = "";
        for(String i : set) kq = kq + i + " ";
        return kq.trim();
    }
    public WordSet difference (WordSet a){
        WordSet u = new WordSet();
        u.set.addAll(set);
        u.set.removeAll(a.set);
        return u;
    }
}
