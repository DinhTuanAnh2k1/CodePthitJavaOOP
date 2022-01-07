/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04020_loppair;

/**
 *
 * @author Admin
 */
public class Pair<S,T> {
     private S first;
    private T second;
    public Pair(S first, T second){
        this.first = first;
        this.second = second;
    }
    public String toString(){
        return first + " " + second;
    }
    public boolean isPrime(){
        return check((Integer)first) && check((Integer)second);
    }
    private boolean check(int n){
        if(n<2) return false;
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}
