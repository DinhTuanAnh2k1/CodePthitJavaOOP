/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04022_wordset;

import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(){
        
    }
    public WordSet(String a){
        String res="";
        a=a+" ";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' '){
                set.add(res.toLowerCase());
                res="";
            }
            else
                res+=a.charAt(i);
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
