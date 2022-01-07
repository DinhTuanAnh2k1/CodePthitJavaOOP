/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04021_lopinsert;

import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();
    public IntSet(){
        
    }
    public IntSet(int a[]){
        
        for(int i:a){
            set.add(i);
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
    public IntSet union(IntSet other){
        IntSet uni = new IntSet();
        uni.set.addAll(set);
        uni.set.addAll(other.set);
        return uni;
    }
//    public IntSet intersection(IntSet other){
//        IntSet inter = new IntSet();
//        inter.set.addAll(set);
//        inter.set.retainAll(other.set);
//        return inter;
//    }
}
